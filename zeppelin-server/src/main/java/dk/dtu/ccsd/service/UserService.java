package dk.dtu.ccsd.service;

import dk.dtu.ccsd.dao.UserDao;
import dk.dtu.ccsd.dto.User;
import dk.dtu.ccsd.resp.LoginResponse;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/**
 * Created by xiuli on 11/12/15.
 */
public class UserService {
  UserDao userDao;

  public UserService() {
    this.userDao = new UserDao();
  }

  public LoginResponse authenticate(User loginUser) {
    User user = userDao.getUserByUsername(loginUser.getUsername());
    String password = DigestUtils.md5Hex(loginUser.getPassword());
    if (user != null && user.getPassword().equals(password)) {
      String token = Jwts.builder().setSubject(user.getUsername())
          .claim("admin", user.isAdmin()).setIssuedAt(new Date())
          .signWith(SignatureAlgorithm.HS256, "citiesdata").compact();
      User respUser = new User();
      respUser.setFirstName(user.getFirstName());
      respUser.setLastName(user.getLastName());
      respUser.setEmail(user.getEmail());
      respUser.setAdmin(user.isAdmin());
      String allowedKeywords = user.getAllowedKeywords();
      String[] keywordArray = StringUtils.split(allowedKeywords, ",");
      if (keywordArray != null && keywordArray.length > 0) {
        for (String keyword : keywordArray) {
          respUser.addAllowedKeyword(keyword);
        }
      }
      return new LoginResponse(respUser, token);
    } else {
      return null;
    }
  }

  public boolean isUsernameExisted(String username) {
    return userDao.isUsernameExisted(username);
  }

  public boolean isEmailExisted(String email) {
    return userDao.isEmailExisted(email);
  }

  public void addUser(User user) {
    userDao.addUser(user);
  }
}

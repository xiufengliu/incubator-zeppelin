package dk.dtu.ccsd.resp;

import dk.dtu.ccsd.dto.User;

/**
 * Created by xiuli on 11/12/15.
 */
public class LoginResponse {
  User user;
  String token;


  public LoginResponse(User user, String token) {
    this.user = user;
    this.token = token;
  }


  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }
}

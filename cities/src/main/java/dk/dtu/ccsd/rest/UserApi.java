package dk.dtu.ccsd.rest;

import com.google.gson.Gson;

import dk.dtu.ccsd.service.UserService;
import dk.dtu.ccsd.dto.User;
import dk.dtu.ccsd.resp.LoginResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.zeppelin.server.JsonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.io.IOException;
import java.util.Date;

/**
 * Created by xiuli on 11/12/15.
 */
@Path("/user")
@Produces("user/json")
public class UserApi {
  Logger logger = LoggerFactory.getLogger(UserApi.class);

  UserService userService;
  Gson gson;

  public UserApi() {
    userService = new UserService();
    gson = new Gson();
  }

  @POST
  @Path("/login")
  public Response login(String message) throws IOException {
    User loginUser = gson.fromJson(message, User.class);
    logger.info("message={}", message);
    logger.info("username={}, password={}, isAdmin={}", loginUser.getUsername(),
        loginUser.getPassword(), loginUser.isAdmin());

    LoginResponse loginResponse = userService.authenticate(loginUser);
    if (loginResponse != null) {
      return new JsonResponse(Response.Status.OK, "", loginResponse).build();
    } else {
      return new JsonResponse(Response.Status.UNAUTHORIZED,
          "Log in failed! Please check your username and password.", "").build();
    }
  }

  @GET
  @Path("/username/{username}")
  public Response username(@PathParam("username") String username) throws IOException {
    return new JsonResponse(Response.Status.OK, "", !userService.isUsernameExisted(username))
        .build();
  }

  @GET
  @Path("/email/{email}")
  public Response emails(@PathParam("email") String email) throws IOException {
    return new JsonResponse(Response.Status.OK, "", !userService.isEmailExisted(email)).build();
  }


  @POST
  @Path("/register")
  public Response register(String message) throws IOException {
    User registerUser = gson.fromJson(message, User.class);
    registerUser.setDob(new Date());
    registerUser.setAllowedKeywords("open");
    registerUser.setPassword(DigestUtils.md5Hex(registerUser.getPassword()));
    userService.addUser(registerUser);
    return new JsonResponse(Response.Status.OK, "", true).build();
  }

  @POST
  @Path("/delete")
  public Response delete(String message) throws IOException {
    return null;
  }

  @POST
  @Path("/update")
  public Response update(String message) throws IOException {
    return null;
  }

  @POST
  @Path("/read")
  public Response read(String message) throws IOException {
    return null;
  }

}

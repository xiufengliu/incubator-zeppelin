package dk.dtu.ccsd.dto;

/**
 * Created by xiuli on 11/12/15.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This is User bean
 */

public class User implements java.io.Serializable {

  private int Id;
  private String username;
  private String password;
  private String firstName;
  private String lastName;
  private String email;
  private boolean admin;
  private String allowedKeywords;
  private List<String> allowedKeywordList = new ArrayList<String>();
  private Date dob;


  public int getId() {
    return Id;
  }

  public void setId(int Id) {
    this.Id = Id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isAdmin() {
    return admin;
  }

  public void setAdmin(boolean admin) {
    this.admin = admin;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getDob() {
    return dob;
  }

  public String getAllowedKeywords() {
    return allowedKeywords;
  }

  public void setAllowedKeywords(String allowedKeywords) {
    this.allowedKeywords = allowedKeywords;
  }

  public List<String> getAllowedKeywordList() {
    return allowedKeywordList;
  }

  public void addAllowedKeyword(String allowedKeyword) {
    this.allowedKeywordList.add(allowedKeyword);
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  @Override
  public String toString() {
    return "User [userid=" + Id + ", username=" + username + ", firstName=" + firstName
        + ", lastName=" + lastName + ", dob=" + dob + ", email="
        + email + ", password=" + password + "]";
  }
}

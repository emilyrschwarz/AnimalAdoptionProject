package models;

import java.util.Date;

public abstract class User {
  protected int id;
  protected String username;
  protected String password;
  protected String firstName;
  protected String lastName;
  protected Date dateOfBirth;
  protected AuthorizationLevel privileges;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public AuthorizationLevel getPrivileges() {
    return privileges;
  }

  public void setPrivileges(AuthorizationLevel privileges) {
    this.privileges = privileges;
  }
}

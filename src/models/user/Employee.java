package models.user;

public class Employee extends User {
  private int salary;

  public Employee(int salary) {
    this.salary = salary;
    privileges = AuthorizationLevel.ADMINISTRATION;
  }
}

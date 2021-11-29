package com.h2;

public class Employee {
  private int id;
  private String firstName;
  private String lastName;
  private int salary;

  Employee(int id, String firstName, String lastName, int salary) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public int getSalary() {
    return salary;
  }

  public String getLastName() {
    return lastName;
  }


  public String getName() {
    return firstName + " " + lastName;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getAnnualSalary() {
    return salary * 12;
  }

  public void raiseSalary(int percent) {
    salary = salary + ((salary / 100) * percent);
  }

  @Override
  public String toString() {
    return "Employee{"
        + "id="
        + id
        + ", firstName='"
        + firstName
        + '\''
        + ", lastName='"
        + lastName
        + '\''
        + ", salary="
        + salary
        + '}';
  }
}

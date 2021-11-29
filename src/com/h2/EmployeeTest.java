package com.h2;

public class EmployeeTest {
  public static void main(String[] args) {
    Employee emp1 = new Employee(56, "Ahzam", "Shahnil", 60000);
    System.out.println(emp1);
    emp1.setSalary(66000);
    System.out.println("Employee Name :" + emp1.getName());
    emp1.raiseSalary(15);
    System.out.println(emp1);
    System.out.println("Employee Annual Salary: " + emp1.getAnnualSalary()+" Rs");
  }
}

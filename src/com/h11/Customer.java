package com.h11;

public class Customer {
  private int ID;
  private String name;
  private char gender;

  public Customer(int ID, String name, char gender) {
    this.ID = Math.abs(ID);
    this.name = name;
    this.gender = gender;
  }

  public int getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public char getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return "Customer{" + "ID=" + ID + ", name='" + name + '\'' + ", gender=" + gender + '}';
  }
}

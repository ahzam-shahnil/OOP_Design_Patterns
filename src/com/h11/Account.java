package com.h11;

public class Account {
  private int id;
  private Customer customer;
  private double balance = 0.0;

  public Account(int id, Customer customer) {
    this.id = id;
    this.customer = customer;
  }

  public Account(int id, Customer customer, double balance) {
    this.id = id;
    this.customer = customer;
    this.balance = balance;
  }

  public int getId() {
    return id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public String getCustomerName() {
    return customer.getName();
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    balance += Math.abs(amount);
  }

  public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= Math.abs(amount);
    } else {
      System.out.println("Amount withdrawn Exceeds the available balance");
    }
  }

  @Override
  public String toString() {
    return "Account{"
        + "id="
        + id
        + ", customer="
        + customer.toString()
        + ", balance="
        + Math.round(balance * 100.0) / 100.0
        + '}';
  }
}

package com.h11;

import java.util.Scanner;

public class DemoCustomerAccount {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.print("Enter name: ");

    String name = myObj.nextLine();
    System.out.print("Enter id: ");
    int id = myObj.nextInt();
    System.out.println("Enter Gender.\n For Male type :'m' & for Female type : 'f' .");
    char gender = myObj.next().charAt(0);
    Customer customer = new Customer(id, name, gender);
    System.out.println(customer);

    Account account = new Account(id, customer);
    System.out.println(account);
    System.out.print("Enter Amount to Withdraw:");
    int amount = myObj.nextInt();
    account.withdraw(amount);
    System.out.print("Enter Amount to Deposit:");
    amount = myObj.nextInt();
    account.deposit(amount);
    System.out.printf("Customer Name is : %s\n", account.getCustomerName());
    System.out.printf("Account balance is : %.2f\n", account.getBalance());
  }
}

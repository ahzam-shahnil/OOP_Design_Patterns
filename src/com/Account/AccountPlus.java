package com.Account;

public class AccountPlus extends Account {
  private int credit;

  public AccountPlus(String title, int credit) {
    super(title);
    this.credit = credit;
  }
  boolean checkTransaction(Transaction transaction){
    return !transaction.getType().equals("debit") || transaction.getAmount() <= (getBalance() + credit);
  }
}

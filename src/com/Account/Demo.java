package com.Account;

public class Demo {
  public static void main(String[] args) {
    //    Account account = new Account("Ahzam");
    //    Transaction transaction1 = new Transaction("credit", 100);
    //    account.post(transaction1);
    //
    //    Transaction transaction2 = new Transaction("debit", 50);
    //    account.post(transaction2);

    AccountPlus accountPlus = new AccountPlus("Ahzam", 1000);
    Transaction transaction3 = new Transaction("credit", 100);
    accountPlus.post(transaction3);

    Transaction transaction4 = new Transaction("debit", 1100);
    accountPlus.post(transaction4);

    System.out.println(accountPlus.getBalance());
  }
}

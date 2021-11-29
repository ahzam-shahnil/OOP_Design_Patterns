package com.h3;

public class InvoiceItemTest {
  public static void main(String[] args) {
    InvoiceItem invoice = new InvoiceItem("b45", "Pubg Mobile Controller", 4, 400);
    System.out.println(invoice);
    System.out.println(invoice.getTotal());
    System.out.println("Description : " + invoice.getDesc());
    invoice.setUnitPrice(350);
    invoice.setQty(5);
    System.out.println("Total Amount : " + invoice.getTotal());
  }
}

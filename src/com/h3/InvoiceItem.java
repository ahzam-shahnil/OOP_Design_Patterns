package com.h3;

public class InvoiceItem {
  private String id;
  private String desc;
  private double unitPrice;
  private int qty;

  InvoiceItem(String id, String desc, int qty, double unitPrice) {
    this.desc = desc;
    this.unitPrice = unitPrice;
    this.id = id;
    this.qty = qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public int getQty() {
    return qty;
  }

  public String getDesc() {
    return desc;
  }

  public String getId() {
    return id;
  }

  public double getTotal() {
    return unitPrice * qty;
  }

  @Override
  public String toString() {
    return "InvoiceItem{"
        + "id='"
        + id
        + '\''
        + ", desc='"
        + desc
        + '\''
        + ", unitPrice="
        + unitPrice
        + ", qty="
        + qty
        + '}';
  }
}

package com.h4;

public class DateTest {
  public static void main(String[] args) {
    Date date = new Date(14,9,2021);
    System.out.println(date);
    date.setDate(13,10,2022);
    System.out.println(date);
  }
}

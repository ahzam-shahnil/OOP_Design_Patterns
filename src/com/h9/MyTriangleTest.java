package com.h9;

public class MyTriangleTest {
  public static void main(String[] args) {
    MyTriangle t = new MyTriangle(4, 5, 5, 8, 4, 8);
    System.out.println("Perimeter : " + Math.round(t.getPerimeter() * 100.0) / 100.0);
    System.out.println("Triangle Type : " + t.getType());
    System.out.println(t);
  }
}

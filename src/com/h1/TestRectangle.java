package com.h1;

public class TestRectangle {

  public static void main(String[] args) {

    Rectangle rect1 = new Rectangle();
    System.out.println("Area of first object=" + rect1.getArea());
    System.out.println("Perimeter of first object=" + rect1.getPerimeter());

    Rectangle rect2 = new Rectangle(20.0, 10.0);
    System.out.println("Area of second object=" + rect2.getArea());
    System.out.println("Perimeter of second object=" + rect2.getPerimeter());
  }
}

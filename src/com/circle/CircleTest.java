package com.circle;

public class CircleTest {
  public static void main(String[] args) {
    SimplifiedCircle c1 = new SimplifiedCircle();

    System.out.println(c1);
    SimplifiedCircle c2 = new SimplifiedCircle(2);
    System.out.println(c2);
    SimplifiedCircle c4 = new SimplifiedCircle(); // construct an instance of Circle
    c4.setRadius(5.0);
    System.out.println(c4);
  }
}

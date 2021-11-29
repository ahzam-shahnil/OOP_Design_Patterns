package com.circle;

public class TestCircle {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    System.out.println(c1);
    Circle c2 = new Circle(2);
    System.out.println(c2);
    Circle c4 = new Circle(); // construct an instance of Circle
    c4.setRadius(5.0); // change radius
// Print radius via getter
    System.out.println("radius is: " + c4.getRadius());
    c4.setColor("green"); // Change color
// Print color via getter
    System.out.println("color is: " + c4.getColor());


  }
}

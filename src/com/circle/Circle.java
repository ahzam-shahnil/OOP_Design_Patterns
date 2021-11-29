package com.circle;

public class Circle {

  private double radius;

  private String color;

  public Circle() {

    radius = 1.0;

    color = "red";
  }

  public Circle(double r) {

    radius = r;
    color = "red";
  }

  public Circle(double r, String color) {

    radius = r;
    this.color = color;
  }

  public double getRadius() {

    return radius;
  }

  public String getColor() {
    return color;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "Circle{" + "radius=" + radius + ", color='" + color + '\'' + '}';
  }
}

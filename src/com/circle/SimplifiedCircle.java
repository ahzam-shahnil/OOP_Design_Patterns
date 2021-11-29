package com.circle;

public class SimplifiedCircle {
  private double radius;

  public SimplifiedCircle() {

    radius = 1.0;
  }

  public SimplifiedCircle(double radius) {

    this.radius = radius;
  }

  public double getRadius() {

    return radius;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public double getCircumference() {
    return 2 * radius * Math.PI;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "SimplifiedCircle{" + "radius=" + radius + '}';
  }
}

package com.h8;

import com.h7.MyPoint;

public class MyCircle {
  private MyPoint center;
  private int radius;

  public MyCircle(int x, int y, int radius) {
    center = new MyPoint(x, y);
    this.radius = radius;
  }

  public MyCircle(MyPoint center, int radius) {
    this.center = center;
    this.radius = radius;
  }

  public MyPoint getCenter() {
    return center;
  }

  public void setCenter(MyPoint center) {
    this.center = center;
  }

  public int getCenterX() {
    return center.getX();
  }

  public void setCenterX(int centerX) {
    this.center.setX(centerX);
  }

  public int getCenterY() {
    return center.getY();
  }

  public void setCenterY(int centerY) {
    this.center.setY(centerY);
  }

  public int[] getCenterXY() {
    return center.getXY();
  }

  public void setCenterY(int x, int y) {
    this.center.setXY(x, y);
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getCircumference() {
    return 2 * Math.PI * radius;
  }

  public double distance(MyCircle another) {
    return this.center.distance(another.getCenter());
  }

  @Override
  public String toString() {
    return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
  }
}

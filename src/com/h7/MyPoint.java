package com.h7;

public class MyPoint {
  private int x, y;

  public MyPoint() {
    x = 0;
    y = 0;
  }

  public int getX() {
    return x;
  }

  public int[] getXY() {

    return new int[]{x, y};
  }

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "MyPoint{" + "x=" + x + ", y=" + y + '}';
  }

  public double distance(int x, int y) {
    return Math.sqrt((Math.pow((this.x - x), 2)) + (Math.pow((this.y - y), 2)));
  }

  public double distance(MyPoint another) {
    return Math.sqrt(
        (Math.pow((this.x - another.getX()), 2)) + (Math.pow((this.y - another.getY()), 2)));
  }

  public double distance() {
    return Math.sqrt((Math.pow((this.x), 2)) + (Math.pow((this.y), 2)));
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

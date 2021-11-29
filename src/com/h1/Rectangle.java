package com.h1;

class Rectangle {

  double length, width;

  Rectangle() {
    length = 1;
    width = 1;
  }

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double getArea() {
    return (length * width);
  }

  double getPerimeter() {
    return (2 * (length + width));
  }

  @Override
  public String toString() {
    return "Rectangle{" +
            "length=" + length +
            ", width=" + width +
            '}';
  }
}

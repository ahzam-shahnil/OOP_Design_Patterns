package com.h8;

import com.h7.MyPoint;

import java.util.Arrays;

public class MyCircleDemo {
  public static void main(String[] args) {
    MyCircle myCircle = new MyCircle(11, 18, 4);
    System.out.println(Arrays.toString(myCircle.getCenterXY()));
    System.out.println("Area :" + Math.round(myCircle.getArea() * 100.0) / 100.0);
    System.out.println("Circumference :" + Math.round(myCircle.getCircumference() * 100.0) / 100.0);

    MyCircle c2 = new MyCircle(new MyPoint(5, 8), 3);
    System.out.println("Distance :" + (Math.round(myCircle.distance(c2) * 100.0) / 100.0));
    System.out.println(myCircle);
  }
}

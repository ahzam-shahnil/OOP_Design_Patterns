package com.h7;

import java.util.Arrays;

public class PointTest {
  public static void main(String[] args) {
    MyPoint p = new MyPoint(4, 8);
    System.out.println(Arrays.toString(p.getXY()));
    System.out.println(p);
    System.out.printf("Distance b/w (7,9) : %.3f\n", p.distance(7, 9));
    MyPoint p1 = new MyPoint(10, 8);
    System.out.printf("Distance b/w another Point : %.3f\n", p.distance(p1));
    System.out.printf("Distance from 0,0 : %.3f\n", p.distance());
  }
}

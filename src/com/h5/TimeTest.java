package com.h5;

public class TimeTest {
  public static void main(String[] args) {
    Time currentTime = new Time(8, 37, 9);
    System.out.println(currentTime);

    currentTime.setTime(9, 8, 9);
    System.out.println("Current Time: " + currentTime);
    System.out.println("Next Second Time: " + currentTime.nextSecond());
    System.out.println("Previous time: " + currentTime.previousSecond());
  }
}

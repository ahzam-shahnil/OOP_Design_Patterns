package com.h5;

public class Time {
  private int hour, minute, second;

  public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  public void setTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public Time nextSecond() {
    second++;
    return new Time(hour, minute, second);
  }

  public Time previousSecond() {
    second--;
    return new Time(hour, minute, second);
  }

  @Override
  public String toString() {
    return "Time{"
        + "hour="
        + (hour < 10 ? "0" + hour : hour)
        + ", minute="
        + (minute < 10 ? "0" + minute : minute)
        + ", second="
        + (second < 10 ? "0" + second : second)
        + '}';
  }
}

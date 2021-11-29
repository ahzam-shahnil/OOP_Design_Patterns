package com.h12;

public class UniversityDemo {
  public static void main(String[] args) {
    Person p = new Student("Ahzam", "Mianwali", "BSe", 2018, 90000.0);
    System.out.println(p);

    p = new Staff("Ayaz", "Mianwali", "Ms Software", 120000.0);
    System.out.println(p);
  }
}

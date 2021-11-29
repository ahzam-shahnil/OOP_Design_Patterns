package com.h6;

public class BookAuthorTest {
  public static void main(String[] args) {
    Author[] authors = new Author[2];
    authors[0] = new Author("Ahzam Shahnil", "ahzam@gmail.com", 'm');
    authors[1] = new Author("Asad", "asad@gmail.com", 'm');
    Book book = new Book("Java Advanced", authors, 19.99, 4);
    System.out.println(book);
    System.out.println("Author Names : " + book.getAuthorNames());
  }
}

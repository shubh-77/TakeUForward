package com.oops.relationshipandobjectbehaviour.object;

import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

}

class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public Library shallowClone() {
        Library newLibrary = new Library(this.name);
        newLibrary.books = this.books;
        return newLibrary;
    }

    public Library deepClone() {
        Library newLibrary = new Library(this.name);
        for (Book book : books) {
            newLibrary.addBook(new Book(book.title, book.author));
        }
        return newLibrary;
    }

    public void addBook(Book book) {
        books.add(new Book(book.title, book.author));
    }

    public void display() {
        System.out.println("Library : " + name);
        for (Book b : books) {
            System.out.printf("Book : %s, Author : %s\n", b.title, b.author);
        }

    }
}

public class CloneClassExample {

}

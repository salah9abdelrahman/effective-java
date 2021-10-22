package com.salah.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {

    private String name;
    private int releaseYear;
    private String isbn;
    private String type;

    public Book(String name, int releaseYear, String isbn, String type) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.isbn = isbn;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public static List<Book> books() {
        return Arrays.asList(
                new Book("The Fellowship of the Ring", 1954, "0395489318", "Action"),
                new Book("The Two Towers", 1954, "0345339711", "Action"),
                new Book("The Return of the King", 1955, "0618129111", "Drama"),
                new Book("Alo", 1950, "0618129111", "Drama"),
                new Book("Alo", 1955, "0618129111", "Biography")
        );
    }
}

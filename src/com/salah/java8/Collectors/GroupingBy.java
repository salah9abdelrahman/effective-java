package com.salah.java8.Collectors;

import com.salah.java8.Book;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class GroupingBy {
    public static void main(String[] args) {

        Map<Integer, List<Book>> booksPerYear = Book.books()
                .stream().collect(groupingBy(Book::getReleaseYear));

        booksPerYear.forEach((key, value) -> System.out.println(key + "\t" + value));

        System.out.println("The second version of groupingBy");

        Map<Integer, Set<Book>> booksPerYearAsSet = Book.books()
                .stream().collect(groupingBy(Book::getReleaseYear, toSet()));

        booksPerYearAsSet.forEach((key, value) -> System.out.println(key + "\t" + value));

        System.out.println("The second version of groupingBy: Counting");

        Map<Integer, Long> booksPerYearLen = Book.books()
                .stream().collect(groupingBy(Book::getReleaseYear, counting()));

        booksPerYearLen.forEach((key, value) -> System.out.println(key + "\t" + value));


        System.out.println("Grouping by two properties");

        Map<String, Map<Integer, List<Book>>> m =
                Book.books()
                        .stream().collect(groupingBy(Book::getType, groupingBy(Book::getReleaseYear)));

        m.forEach((key, value) -> System.out.println(key + "\t" + value));




    }
}

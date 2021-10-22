package com.salah.java8.Collectors;


import com.salah.java8.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMap {
    public static void main(String[] args) {
        /*
          toMap
          args:
              1)  keyMapper function
              2) valueMapper function
              3) mergeFunction to determine duplicates strategy
              4) mapFactory to produce map instance other than HashMap
         */

        Map<Integer, Book> bookMap = Book.books().stream()
                .collect(Collectors.toMap(Book::getReleaseYear, Function.identity(),
                        (existing, replacement) -> existing, TreeMap::new));

        bookMap.forEach((key, value) -> System.out.println(key + "\t" + value));

    }


}

package com.salah.java8.lambdas;

import java.util.*;

public class Lambdas {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("ascs", "grfdsc", "zxasc", "kdcsdc");
        // anonymous classes
        words.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        //lambda
        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // comparator constructor
        words.sort(Comparator.comparingInt(String::length));

        words.forEach(System.out::println);

        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", String::length);
        System.out.println(value);


    }

}

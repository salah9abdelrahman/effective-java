package com.salah.Item1;

/*
 Static factory methods instead of constructors
 */
public class Main {
    public static void main(String[] args) {
        Student salah = Student.createStudentWhoCalledSalah(25, "salah9abdelrahman@outlook.com");
        System.out.println(salah);
    }
}

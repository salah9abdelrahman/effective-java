package com.salah.Item1;

public class Student {

    private String name;
    private int age;
    private String email;

    private Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public static Student createStudentWhoCalledSalah(int age, String email) {
        return new Student("Salah", age, email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

package com.salah.item4;

/*
there is no sense on creating objects of utility classes so to suppress the default constructor we will
provide private one
 */
public class UtilClass {
    private UtilClass() {
        throw new AssertionError();
    }
}

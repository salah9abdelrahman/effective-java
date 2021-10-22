package com.salah.item19;

public class Super {
    public Super() {
        // Constructors must not invoke overridable methods
        overrideableMethod();
    }

    public void overrideableMethod() {
    }
}

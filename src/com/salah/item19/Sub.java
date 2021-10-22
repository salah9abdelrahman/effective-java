package com.salah.item19;

import java.time.Instant;

public class Sub extends Super {
    private final Instant instant;

    public Sub() {
        instant = Instant.now();
    }

    @Override
    public void overrideableMethod() {
        //Null pointer exception
        System.out.println(instant.getEpochSecond());
        System.out.println(instant);
    }
}

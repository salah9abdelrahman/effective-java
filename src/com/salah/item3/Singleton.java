package com.salah.item3;
/*
 To overcome the problems with Serialization and Reflection
 */
public enum Singleton {
    INSTANCE;

    private int s;

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
}

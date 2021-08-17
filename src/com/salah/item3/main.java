package com.salah.item3;

public class main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;

       singleton.setS(1);
        System.out.println(singleton.getS());
    }

}


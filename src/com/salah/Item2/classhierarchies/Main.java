package com.salah.Item2.classhierarchies;

import static com.salah.Item2.classhierarchies.NyPizza.Size.*;
import static com.salah.Item2.classhierarchies.Pizza.Topping.*;

public class Main {

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(HAM).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
    }
}

package com.salah.item10And11;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<PhoneNumber,String> m = new HashMap<>();
        m.put(new PhoneNumber(20, 24, 54), "Salah");
        System.out.println(m.get(new PhoneNumber(20, 24, 54)));
    }
}

package com.company;

public class MySingleton2 {

    private MySingleton2() {
        System.out.println("Singleton created!");
    }

    public static final MySingleton2 INSTANCE = new MySingleton2();
}

package com.company;

public class MySingleton1 {
    private static MySingleton1 instance;

    private MySingleton1() {
        System.out.println("Singleton created!");
    }

    public static synchronized MySingleton1 getInstance() {
        if (instance == null) {
            instance = new MySingleton1();
        }
        return instance;
    }
}

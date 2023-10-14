package com.company;

public enum MySingleton3 {

    INSTANCE;

    private MySingleton3() {
        System.out.println("Singleton created!");
    }
}

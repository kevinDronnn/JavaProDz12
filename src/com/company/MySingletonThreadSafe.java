package com.company;

public class MySingletonThreadSafe {
    private volatile static MySingletonThreadSafe instance;
    private MySingletonThreadSafe() {}
    public static MySingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (MySingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new MySingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}

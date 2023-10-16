package com.company;

public class MySingletonThreadSafe {
    private volatile static MySingletonThreadSafe instance;
    public String value;

    private MySingletonThreadSafe(String value) {
        this.value = value;
    }
    public static MySingletonThreadSafe getInstance(String value) {
        if (instance == null) {
            synchronized (MySingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new MySingletonThreadSafe(value);
                }
            }
        }
        return instance;
    }
}

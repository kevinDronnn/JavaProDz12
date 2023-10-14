package com.company;

public class Main {

    public static void main(String[] args) {
        MySingleton1 firstInstance = MySingleton1.getInstance();
        System.out.println(firstInstance.getClass());
        MySingleton1 secondInstance = MySingleton1.getInstance();
        System.out.println(firstInstance == secondInstance);

        System.out.println(MySingleton2.INSTANCE.getClass());

        System.out.println(MySingleton3.INSTANCE);
        System.out.println(MySingleton3.INSTANCE);

        MySingletonThreadSafe first = MySingletonThreadSafe.getInstance();
        System.out.println(first.getClass());
        MySingletonThreadSafe second = MySingletonThreadSafe.getInstance();
        System.out.println(first == second);
    }
}

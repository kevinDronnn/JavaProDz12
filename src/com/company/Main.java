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

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            MySingletonThreadSafe singleton = MySingletonThreadSafe.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            MySingletonThreadSafe singleton = MySingletonThreadSafe.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}

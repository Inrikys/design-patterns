package com.example.demo.criacional.singleton;

public class DemoSingletonThreadSafe {

    public static void main(String[] args) {
        execucaoComUnicaThread();
        execucaoComMultiThreads();
    }

    private static void execucaoComUnicaThread() {
        System.out.println("****************");
        System.out.println("COM UNICA THREAD");
        System.out.println("****************");

        SingletonThreadSafe singleton = SingletonThreadSafe.getInstance("FOO");
        SingletonThreadSafe anotherSingleton = SingletonThreadSafe.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

    }

    private static void execucaoComMultiThreads() {

        System.out.println("****************");
        System.out.println("COM MULTI THREADS");
        System.out.println("****************");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonThreadSafe singleton = SingletonThreadSafe.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonThreadSafe singleton = SingletonThreadSafe.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }

}

package com.journaldev.singleton;


public class StaticBlockSingletonTest {
    public static void main(String[] args) {
        StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();

        System.out.println("Instance 1: " + singleton1);
        System.out.println("Instance 2: " + singleton2);

        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same (Singleton works!)");
        } else {
            System.out.println("Instances are different (Singleton failed!)");
        }
    }
}

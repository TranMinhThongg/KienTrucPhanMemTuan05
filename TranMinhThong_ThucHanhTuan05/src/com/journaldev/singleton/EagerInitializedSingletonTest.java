package com.journaldev.singleton;

public class EagerInitializedSingletonTest {
    public static void main(String[] args) {
        // Lấy instance của Singleton
        EagerInitializedSingleton singleton1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton singleton2 = EagerInitializedSingleton.getInstance();

        // Kiểm tra xem cả hai instance có giống nhau không
        singleton1.showMessage();
        singleton2.showMessage();

        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same (Singleton works!)");
        } else {
            System.out.println("Instances are different (Singleton failed!)");
        }
    }
}

package com.journaldev.singleton;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor để ngăn chặn tạo instance từ bên ngoài
    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Eager Singleton Instance: " + this);
    }
}	

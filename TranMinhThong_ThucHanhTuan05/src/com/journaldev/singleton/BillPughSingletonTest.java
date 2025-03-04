package com.journaldev.singleton;

public class BillPughSingletonTest {
	public static void main(String[] args) {
        BillPughSingleton singleton1 = BillPughSingleton.getInstance();
        BillPughSingleton singleton2 = BillPughSingleton.getInstance();

        System.out.println("Bill Pugh Singleton:");
        System.out.println("Instance 1: " + singleton1);
        System.out.println("Instance 2: " + singleton2);
        System.out.println(singleton1 == singleton2 ? "Both instances are the same (Singleton works!)" : "Instances are different (Singleton failed!)");
    }
}

package com.journaldev.singleton;

public class ThreadSafeSingletonTest {
	public static void main(String[] args) {
		// Kiểm tra Synchronized Method
		ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();

		System.out.println("Synchronized Method:");
		System.out.println("Instance 1: " + singleton1);
		System.out.println("Instance 2: " + singleton2);
		System.out.println(singleton1 == singleton2 ? "Both instances are the same (Singleton works!)"
				: "Instances are different (Singleton failed!)");

		// Kiểm tra Double-Checked Locking
		ThreadSafeSingleton singleton3 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		ThreadSafeSingleton singleton4 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();

		System.out.println("\nDouble-Checked Locking:");
		System.out.println("Instance 3: " + singleton3);
		System.out.println("Instance 4: " + singleton4);
		System.out.println(singleton3 == singleton4 ? "Both instances are the same (Singleton works!)"
				: "Instances are different (Singleton failed!)");
	}
}

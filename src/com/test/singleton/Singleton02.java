package com.test.singleton;

/**
 * 并发效率低
 * 
 * @author Administrator
 */
public class Singleton02 {
	private Singleton02() {
		System.out.println("懒汉式");
	}

	private static Singleton02 singleton = null;

	public static synchronized Singleton02 getInstance() {
		if (singleton == null)
			singleton = new Singleton02();
		return singleton;
	}
}

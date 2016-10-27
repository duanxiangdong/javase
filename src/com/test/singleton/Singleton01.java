package com.test.singleton;

/**
 * static会在类加载时初始化,不会发生多个对象线程不安全问题, 如果只是加载本类依然初始化了对象,不能做到懒加载.
 * 
 * @author Administrator
 */
public class Singleton01 {
	private Singleton01() {
		if (singleton != null) {
			throw new RuntimeException();
		}
		System.out.println("饿汉式 ");
	}

	private static Singleton01 singleton = new Singleton01();

	public static Singleton01 getInstance() {
		return singleton;
	}
}

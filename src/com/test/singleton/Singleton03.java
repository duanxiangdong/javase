package com.test.singleton;

/**
 * 静态内部类模式 static 确保唯一性
 * 
 * @author Administrator
 */
public class Singleton03 {
	private Singleton03() {
		System.out.println("静态内部类模式");
	}

	private static class SinletonHandler {
		private static Singleton03 singleton = new Singleton03();
	}

	public static Singleton03 getInstance() {
		return SinletonHandler.singleton;
	}
}

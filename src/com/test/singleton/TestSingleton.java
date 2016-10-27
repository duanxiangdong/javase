package com.test.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Singleton03 s1 = Singleton03.getInstance();
		Singleton03 s2 = Singleton03.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		// 利用反射,破坏单例模式,还可以利用反序列化破坏单例模式
		Constructor<Singleton03> constructor = Singleton03.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton03 s3 = constructor.newInstance();
		Singleton03 s4 = constructor.newInstance();
		System.out.println(s3);
		System.out.println(s4);
	}
}
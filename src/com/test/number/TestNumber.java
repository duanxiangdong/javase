package com.test.number;

public class TestNumber {
	public static void main(String[] args) {
		test02();
	}
	
	private static void test01(){
		Long num1 = 1L;
		Long num2 = 2L;
		Long num3 = 1L;
		System.out.println(num1 + num2);
		System.out.println(num1.equals(num3));
	}
	
	/**
	 * Integer 内部类IntegerCache 为-128 -- 127提供缓存
	 */
	private static void test02(){
		Integer a = 1000, b = 1000;
		Integer c = 100, d = 100;
		System.out.println(a == b);
		System.out.println( c == d);
	}
}
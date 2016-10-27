package com.test.string;

import java.util.StringTokenizer;

public class TestString {
	public static void main(String[] args) {
		test02();
	}

	private static void test01() {
		try {
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			String res1 = e.getMessage() == null ? "1" : "2";
			String res2 = "null" == null ? "1" : "2";
			String res3 = null == null ? "1" : "2";
			System.out.println(res1);
			System.out.println(res2);
			System.out.println(res3);
		}
	}

	private static void test02() {
		String str = "1,2,3,4";
		StringTokenizer sk = new StringTokenizer(str, ",");
		while (sk.hasMoreElements()) {
			System.out.println(sk.nextToken());
		}
	}

}

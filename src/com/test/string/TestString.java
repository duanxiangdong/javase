package com.test.string;

import java.util.StringTokenizer;
import java.util.regex.Pattern;
/**
 * 字符串测试
 */
public class TestString {
	private static final Pattern PATTERN = Pattern.compile("([\\w]+\\|[\\w]+)+");
	
	public static void main(String[] args) {
		test04();
	}
	
	/**
	 * null
	 */
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
	
	/**
	 * StringTokenizer
	 */
	private static void test02() {
		String str = "1,2,3,4";
		StringTokenizer sk = new StringTokenizer(str, ",");
		while (sk.hasMoreElements()) {
			System.out.println(sk.nextToken());
		}
	}
	
	/**
	 * split
	 */
	private static void test03(){
		String order = "001|002";
		String[] orders = order.split("\\|");
		int length = orders.length;
		System.out.println("长度:"+length);
		for(int i=0;i<length;i++){
			System.out.println(orders[i]);
		}
		
	}
	
	/**
	 * Pattern
	 */
	private static void test04(){
		String order = "bus001";
		System.out.println(PATTERN.matcher(order).matches());
		
	}
}
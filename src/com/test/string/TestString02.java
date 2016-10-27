package com.test.string;

public class TestString02 {
	public static void main(String[] args) {
		String bankCard = "622848047";
		System.out.println(bankCard.substring(bankCard.length()-4, bankCard.length()));
		System.out.println(bankCard.substring(0, 6));
	}
}

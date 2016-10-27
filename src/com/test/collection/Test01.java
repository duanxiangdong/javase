package com.test.collection;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> subList = list.subList(0, 10);
		System.out.println(subList);
	}
}

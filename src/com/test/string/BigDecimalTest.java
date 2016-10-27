package com.test.string;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		String payAmount = "100";
		String orderAmount = "9900";
		BigDecimal num = new BigDecimal(payAmount);
		BigDecimal item = new BigDecimal(orderAmount);
		System.out.println(num.compareTo(item));
		
		System.out.println(merAmtToAmount("9900"));
	}
	
	public static final String merAmtToAmount(String amt){		
		BigDecimal num = new BigDecimal(amt);
		return num.divide(new BigDecimal(100),2,BigDecimal.ROUND_HALF_UP).toString();
	}
}

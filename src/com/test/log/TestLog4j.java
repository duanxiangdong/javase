package com.test.log;

import org.apache.log4j.Logger;

import com.test.string.UseInfo;

public class TestLog4j {
	private static Logger log = Logger.getLogger(TestLog4j.class);

	public static void main(String[] args) {
		UseInfo useInfo = null;
		log.info("你好"+useInfo);
	}
}

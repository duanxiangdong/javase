package com.test.xstream;

import com.thoughtworks.xstream.XStream;

public class XstreamTest02 {
	public static void main(String[] args) {
		XStream xstream = new XStream();
		xstream.processAnnotations(Alipay.class);
		Alipay alipay = new Alipay();
		alipay.setError("11");
		alipay.setIsSuccess("111");
		
		String xml = xstream.toXML(alipay);
		System.out.println("生成文件:"+xml);
	}
}

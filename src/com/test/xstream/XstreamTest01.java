package com.test.xstream;

import java.util.Date;

import com.nxin.sysmodule.util.Constants;
import com.nxin.sysmodule.util.DateUtils;
import com.thoughtworks.xstream.XStream;

public class XstreamTest01 {
	public static void main(String[] args) {
		String orderno = DateUtils.formatDate(new Date(), Constants.DATE_TIME_FORMAT_OTHER);
		CommonMessage commonMessage = new CommonMessage("IBBF19", "", "", orderno, "", "", "");
		MessageCorp corp = new MessageCorp("<![CDATA[99000000]]>", "3120010194000261");
		MessageCmp cmp = new MessageCmp("31", "200101040010880", "1", "");
		MessageSigned message = new MessageSigned(commonMessage, cmp, corp, "0");
		XStream xstream = new XStream();
//		xstream.alias("aa", MessageCorp.class);
//		xstream.alias("cmp", MessageCmp.class);
		xstream.alias("ap",MessageSigned.class);
		xstream.aliasField("", MessageSigned.class, "commonMessage");
		String xml = xstream.toXML(message);
		System.out.println("生成报文:" + xml);
	}
}

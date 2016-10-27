package com.test.xstream3;

import java.util.HashMap;
import java.util.Map;

import com.nxin.sysmodule.enums.system.EResultCode;
import com.nxin.sysmodule.security.MD5;
import com.nxin.sysmodule.util.CollectionUtils;
import com.thoughtworks.xstream.XStream;

public class Test02 {
	public static void main(String[] args) {
		XStream xstream = new XStream();
		String status = EResultCode.success.getStat();
		String resMsg = "交易成功";
		String userId = "123456";
		Map<String, String> map = new HashMap<String, String>();
		map.put("userId", userId);
		map.put("status", status);
		map.put("resMsg", resMsg);
		String str = CollectionUtils.sortMap(map);
		String signmsg = MD5.encryption(str);
		UserCardInfoResult cardInfo = new UserCardInfoResult(status, resMsg, userId, signmsg);
		xstream.processAnnotations(UserCardInfoResult.class);
		String xml = xstream.toXML(cardInfo);
		System.out.println("生成文件:" + xml);
	}
}

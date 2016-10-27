package com.test.xstream3;

import java.util.HashMap;
import java.util.Map;

import com.nxin.sysmodule.security.MD5;
import com.nxin.sysmodule.util.CollectionUtils;
import com.thoughtworks.xstream.XStream;

public class Test01 {
	public static void main(String[] args) {
		XStream xstream = new XStream();
		String userId = "123456";
		String bankName = "中国农业银行";
		String mobile = "13717738216";
		String identityCode = "152103199110018210";
		String cardNo = "6228480470824107416";
		String cardHolder = "张老师";
		Map<String,String> map = new HashMap<String,String>();
		map.put("userId", userId);
		map.put("bankName", bankName);
		map.put("mobile", mobile);
		map.put("identityCode", identityCode);
		map.put("cardNo", cardNo);
		map.put("cardHolder", cardHolder);
		String str = CollectionUtils.sortMap(map);
		System.out.println("生成字符串:"+str);
		String signmsg = MD5.encryption(str);
		UserCardInfo cardInfo = new UserCardInfo(userId,bankName,mobile,identityCode,cardNo,cardHolder,signmsg);
		xstream.processAnnotations(UserCardInfo.class);
		String xml = xstream.toXML(cardInfo);
		System.out.println("生成文件:" + xml);
	}
}

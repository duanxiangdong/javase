package com.test.xstream3;

import com.thoughtworks.xstream.XStream;

public class Test03 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("<ReturnInfo><GeneralInfoReturn><UUID>1</UUID><PlateformCode>2</PlateformCode><ErrorCode>01</ErrorCode><ErrorMessage>XML解析错误</ErrorMessage></GeneralInfoReturn></ReturnInfo>");
		XStream xstream = new XStream();
		xstream.processAnnotations(ReturnInfo.class);
		ReturnInfo returnInfo = (ReturnInfo)xstream.fromXML(sb.toString(), ReturnInfo.class);
		System.out.println(returnInfo.getGeneralInfoReturn().getErrorMessage());
	}
}

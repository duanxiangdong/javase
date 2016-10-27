package com.test.cgb;

import java.util.Date;

import com.nxin.sysmodule.util.Constants;
import com.nxin.sysmodule.util.DateUtils;
import com.thoughtworks.xstream.XStream;

public class MainTest {
	public static void main(String[] args) {
		CSReq cSReq = new CSReq();
		String cSReqId = DateUtils.formatDate(new Date(), Constants.DATE_TIME_FORMAT_OTHER);
		cSReq.setId(cSReqId);
		cSReq.setCertId("001");
		cSReq.setInstId("111");
		cSReq.setVersion("1.0.1");
		
		
		CanonicalizationMethod canonicalizationMethod = new CanonicalizationMethod();
		canonicalizationMethod.setAlgorithm("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
		
		SignedInfo signedInfo = new SignedInfo();
		signedInfo.setCanonicalizationMethod(canonicalizationMethod);
		
		Signature signature = new Signature();		
		signature.setXmlns("http://www.w3.org/2000/09/xmldsig#");
		signature.setSignedInfo(signedInfo);
		
		
		Message message = new Message(); 		
		String messageId = DateUtils.formatDate(new Date(), Constants.DATE_TIME_FORMAT_OTHER);				
		message.setId(messageId);
		message.setcSReq(cSReq);
		message.setSignature(signature);
		
		SoEv soEv = new SoEv();	
		soEv.setMessage(message);
		
		XStream xstream = new XStream();
		xstream.processAnnotations(SoEv.class);
		String xml = xstream.toXML(soEv);
		System.out.println("生成文件:" + xml);
	}
}
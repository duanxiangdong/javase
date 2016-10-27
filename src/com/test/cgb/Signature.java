package com.test.cgb;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Signature {
	@XStreamAsAttribute
	private String xmlns;
	@XStreamAlias("SignedInfo")
	private SignedInfo signedInfo;
	
	public String getXmlns() {
		return xmlns;
	}

	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	public SignedInfo getSignedInfo() {
		return signedInfo;
	}

	public void setSignedInfo(SignedInfo signedInfo) {
		this.signedInfo = signedInfo;
	}
}

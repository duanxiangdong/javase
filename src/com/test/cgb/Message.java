package com.test.cgb;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Message {
	@XStreamAlias("id")
	@XStreamAsAttribute
	private String id;
	@XStreamAlias("CSReq")
	private CSReq cSReq;
	@XStreamAlias("Signature")
	private Signature signature;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CSReq getcSReq() {
		return cSReq;
	}

	public void setcSReq(CSReq cSReq) {
		this.cSReq = cSReq;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}
}
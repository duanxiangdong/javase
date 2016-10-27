package com.test.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class MessageSigned {
	private CommonMessage commonMessage;
	private MessageCmp cmp;
	private MessageCorp corp;
	private String Amt;

	public MessageSigned(CommonMessage commonMessage, MessageCmp cmp, MessageCorp corp, String Amt) {
		this.commonMessage = commonMessage;
		this.cmp = cmp;
		this.corp = corp;
		this.Amt = Amt;
	}

	public MessageCmp getCmp() {
		return cmp;
	}

	public void setCmp(MessageCmp cmp) {
		this.cmp = cmp;
	}

	public MessageCorp getCorp() {
		return corp;
	}

	public void setCorp(MessageCorp corp) {
		this.corp = corp;
	}

	public String getAmt() {
		return Amt;
	}

	public void setAmt(String amt) {
		Amt = amt;
	}

	public CommonMessage getCommonMessage() {
		return commonMessage;
	}

	public void setCommonMessage(CommonMessage commonMessage) {
		this.commonMessage = commonMessage;
	}

}

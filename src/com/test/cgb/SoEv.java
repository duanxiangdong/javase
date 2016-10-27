package com.test.cgb;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 广发银行 根元素
 * @author duan
 */
@XStreamAlias("SoEv")
public class SoEv {
	@XStreamAlias("Message")
	private Message Message;

	public Message getMessage() {
		return Message;
	}

	public void setMessage(Message message) {
		Message = message;
	}
}
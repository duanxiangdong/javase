package com.test.cgb;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class SignedInfo {
	@XStreamAlias("CanonicalizationMethod")
	private CanonicalizationMethod canonicalizationMethod;

	public CanonicalizationMethod getCanonicalizationMethod() {
		return canonicalizationMethod;
	}

	public void setCanonicalizationMethod(CanonicalizationMethod canonicalizationMethod) {
		this.canonicalizationMethod = canonicalizationMethod;
	}
}
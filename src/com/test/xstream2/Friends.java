package com.test.xstream2;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class Friends {
	@XStreamImplicit(itemFieldName="name")
	private List<String> name;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

}

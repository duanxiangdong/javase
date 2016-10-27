package com.test.xstream2;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

//@XStreamAlias("pet")
@XStreamConverter(value = ToAttributedValueConverter.class, strings = { "age" })
public class Animal {
	@XStreamAlias("kind")
	@XStreamAsAttribute
	private String kind;
	@XStreamAlias("name")
	@XStreamAsAttribute
	private String name;
	@XStreamAlias("age")
	private int age;

	public Animal(String kind, String name, int age) {
		this.kind = kind;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

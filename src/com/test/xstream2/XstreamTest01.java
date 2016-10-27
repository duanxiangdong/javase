package com.test.xstream2;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class XstreamTest01 {
	public static void main(String[] args) {
		PersonBean per = new PersonBean();
		per.setFirstName("duan");
		per.setLastName("xiangdong");

		PhoneNumber tel = new PhoneNumber();
		tel.setCode(137280);
		tel.setNumber("137280968");

		PhoneNumber fax = new PhoneNumber();
		fax.setCode(20);
		fax.setNumber("020221327");
		per.setTel(tel);
		per.setFax(fax);

		// 测试一个标签下有多个同名标签
		List<String> friendList = new ArrayList<String>();
		friendList.add("A1");
		friendList.add("A2");
		friendList.add("A3");
		Friends friend1 = new Friends();
		friend1.setName(friendList);
		per.setFriend(friend1);

		// 测试一个标签下循环对象
		Animal dog = new Animal("dog","Dolly", 2);
		Animal cat = new Animal("cat","Ketty", 2);
		List<Animal> petList = new ArrayList<Animal>();
		petList.add(dog);
		petList.add(cat);
		Pets pet = new Pets();
		pet.setAnimalList(petList);
		per.setPet(pet);

		XStream xstream = new XStream();
		xstream.processAnnotations(PersonBean.class);
		String xml = xstream.toXML(per);
		System.out.println("生成文件:" + xml);

	}
}

package com.test;

import java.util.ArrayList;
import java.util.List;

public class EqualsTest {
	private String value = null;

	public EqualsTest(String v){
		value = v;
	}
	
	// @Override
	public boolean equals(EqualsTest o) {
		// TODO Auto-generated method stub
		if(o == this){
			return true;
		}
		if(o instanceof EqualsTest){
			EqualsTest test = (EqualsTest)o;
			return value.equals(test.value);
		}
		
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EqualsTest> list = new ArrayList<EqualsTest>();
		
		EqualsTest test1 = new EqualsTest("object");
		EqualsTest test2 = new EqualsTest("object");
		EqualsTest test3 = new EqualsTest("object");
		Object test4 = new EqualsTest("object");
		
		list.add(test1);
		
		System.out.println(list.contains(test2));
		System.out.println(test2.equals(test3));
		System.out.println(test3.equals(test4));
		
	}

}

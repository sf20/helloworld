package com.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello World");
		// test2();
		// Test t = new Test();
		// t.first();
		// stringEquals();
		stringTest();
	}

	static void stringTest() {
		String i = "1";
		System.out.println(i + 1);
		if (i == i + 0) {
			System.out.println("hehe");
		}
	}

	static void stringEquals() {
		String s1 = "asdf";
		String s2 = s1;
		String s5 = "asdf";
		String s3 = new String("asdf");
		String s4 = new String("asdf");
		System.out.println(s1 == s5);
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
	}

	void first() {
		int i = 5;
		Value v = new Value();
		v.i = 25;
		second(v, i);
		System.out.println(v.i);
	}

	private void second(Value v1, int i) {
		// TODO Auto-generated method stub
		i = 0;
		v1.i = 20;
		Value val = new Value();
		v1 = val;
		System.out.println(v1.i + " " + i);
	}

	static void test2() {
		int a = 5;
		System.out.println((a > 5) ? 10.9 : 9);
	}

	static void test3() {
		try {
			throw new Exception("test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void test1() {
		// for(int i = 1;i <= 10;i++){
		//
		// }
		//
		// if(true){
		// int test = 10;
		// }
		// System.out.println(test);

		Object o1 = new String("abc");
		Object o2 = o1;
		o1 = null;
		System.out.println(o2.toString());
	}
}

class Value {
	public int i = 15;
}
package com.test;

class X {
	Y b = new Y();

	X() {
		System.out.println("X");
	}
}

class Y {
	Y() {
		System.out.println("Y");
	}
}

public class Z extends X {
	Y y = new Y();

	Z() {
		System.out.println("Z");
	}

	public static void main(String[] args) {
		new Z();
	}
}

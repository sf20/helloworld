package com.test;

public class Father {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		Father c = new Child();
		System.out.println(f.getName());
		System.out.println(c.getName());
	}

	public static String getName(){
		return "father";
	}
	
	public void empty(int i){
		
	}
}

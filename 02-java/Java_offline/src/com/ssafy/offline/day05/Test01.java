package com.ssafy.offline.day05;

public class Test01 {

	public static void main(String[] args) {
		
		new Child();
	}
}

class Parent {
	
	Parent(){
		System.out.println(1);
	}
	Parent(String name){
		System.out.println(2);
	}
}

class Child extends Parent {
	
	Child(){
		super();
		System.out.println(3);
	}
	Child(int num){
		System.out.println(4);
	}
}


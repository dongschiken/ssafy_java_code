package com.ssafy.offline;

public class Test {
	public static void main(String[] args) {
		Test01Manager test01Manager = Test01Manager.getInstance();
		test01Manager.age = 10;
		System.out.println(test01Manager.age);
	}
}

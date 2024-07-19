package com.ssafy.domabbam;

public class DomaBbam {
	
	String name;
	int age;
	String gender;
	double length;
	
	public DomaBbam(String name, int age, String gender, double length) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.length = length;
	}
	public DomaBbam() {}
	public void show() {
		System.out.println("도마뱀 이름은 : "+this.name+"입니다.");
		System.out.println("도마뱀 나이는 : "+this.age+"입니다.");
		System.out.println("도마뱀 성별은 : "+this.gender+"입니다.");
		System.out.println("도마뱀 길이는 : "+this.length+"입니다.");	
	}
	

}

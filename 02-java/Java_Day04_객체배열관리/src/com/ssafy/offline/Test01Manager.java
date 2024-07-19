package com.ssafy.offline;

public class Test01Manager {
	
	public int age;
	
	private static Test01Manager instance = new Test01Manager();
	
	private Test01Manager() {}
	
	public static Test01Manager getInstance() {
		return instance;
	}
	
}

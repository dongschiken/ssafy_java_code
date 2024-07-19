package com.ssafy.hw.day02.step01;

import java.io.*;

import java.util.*;

public class Birth {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] birthday = new int[4];
		birthday[0] = 0;
		birthday[1] = 6;
		birthday[2] = 0;
		birthday[3] = 7;
		
		System.out.println(Arrays.toString(birthday));
		String[] name = {"배한진", "이대현", "채건우"};
		System.out.println(Arrays.toString(name));
	}
}
package com.ssafy.hw.day02.step02;

import java.io.*;
import java.util.*;

public class Food {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		int n = Integer.parseInt(br.readLine());
		String[] foods = new String[n];
		for (int i = 0; i < n; i++) {
			bw.write((foods[i] = br.readLine())+"\n");
		}
		bw.flush();
	}
}

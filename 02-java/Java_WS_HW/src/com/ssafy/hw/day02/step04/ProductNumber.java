package com.ssafy.hw.day02.step04;

import java.io.*;
import java.util.*;

public class ProductNumber {
	
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < N; i++) {
			int count = N;
			for (int j = 0; j < N; j++) {
				if(j == i) continue;
				if(arr[j] <= arr[i]) {
					count--;
				}
			}
			bw.write(count+" ");
		}
		bw.flush();
	}

}
//# test01
//9
//800
//1000
//900
//1500
//500
//1000
//1000
//1000
//1000
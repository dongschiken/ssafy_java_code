package com.ssafy.hw.day02.step05;

import java.io.*;
import java.util.*;

public class EmergencyEscape {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 8
		int N = Integer.parseInt(br.readLine());
		// 속도
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 고도
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int[][] escapes = new int[N+1][2];
		for (int i = 1; i < escapes.length; i++) {
			escapes[i][0] = Integer.parseInt(st.nextToken());
			escapes[i][1] = Integer.parseInt(st2.nextToken());
		} 
		
		int testcase = 4;
		int sectionAverage = 900;
		int altitude = 4000;
		int speedSum = 0;
		int speedAvg = 0;
		int temp = 0;
		int minMinute = Integer.MAX_VALUE;
		OUT:
		while (testcase > 1) {
			// 구간 평균

			// 일단 1~testcase의 분만큼 구간합 구하기
			for (int i = 1; i <= testcase; i++) {
				speedSum += escapes[i][0];
			}
			
			// testcase가 4라면 speedSum에서 escape[0][0]을빼고 escape[4][0]을더하면 다음 speedSum값이 나온다.
			for (int i = 1; i <= N - testcase; i++) {
				speedAvg = speedSum / testcase;
				
				if(speedAvg >= sectionAverage) {
					// 고도까지 하강해야하므로 여기서 고도 하강 체크
					// 고도 하강 이 4000, 3000, 2000 이상이라면 while문 탈출
					int descent = escapes[i][1] - escapes[i+testcase][1];
					if(descent >= altitude) {
						temp = i+testcase;
						break OUT;
					}
				}
				speedSum -= escapes[i][0];
				speedSum += escapes[i+testcase][0];
			}
			speedSum = 0;
			speedAvg = 0;
			altitude -= 1000;
			sectionAverage += 100;
			testcase--;
		}
		
		
		minMinute = Math.min(minMinute, temp);
		// 만약 minMinute이 0이면 탈출 못한거라서 -1 출력
		if(minMinute == 0) {
			System.out.println(-1);
		}else {
			System.out.println(minMinute);
		}
	}
	
}

// #test01
//8
//700 900 900 950 850 800 800 600
//8000 9000 8000 7000 6000 5000 6500 6000

//#test02
//8
//700 900 800 600 800 1000 1300 600
//8000 9000 8000 7000 7500 7000 7500 5000

//#test03
//8
//700 900 600 600 500 900 800 600
//8000 9000 8000 7000 7000 7000 7500 7000
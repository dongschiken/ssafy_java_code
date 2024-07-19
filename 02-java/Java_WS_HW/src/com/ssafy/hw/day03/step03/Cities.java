package com.ssafy.hw.day03.step03;

import java.io.*;
import java.util.*;

public class Cities {
	
	static int[] dirX = {1, -1, 0, 0, 1, 1, -1, -1};
	static int[] dirY = {0, 0, 1, -1, -1, 1, 1, -1};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			
			// 도시의 범위를 M+2로 지정 => 범위를 벗어났을 때 0이니까 탐색 안해도된다. 라는 조건
			int M = Integer.parseInt(br.readLine());
			
			// G == 1 B == 2
			// 만약 범위를 벗어나면 == 0 
			int[][] city = new int[M+2][M+2];
			StringTokenizer st;
			for (int j = 1; j <= M; j++) {
				st = new StringTokenizer(br.readLine());
				for (int j2 = 1; j2 <= M; j2++) {
					if(st.nextToken().equals("G")) {
						city[j][j2] = 1;
					}else {
						city[j][j2] = 2;
					}
				}
			}
			int max = Integer.MIN_VALUE;
			for (int j = 1; j <= M; j++) {
				boolean check = true;
				int count = 0;
				for (int j2 = 1; j2 <= M; j2++) {
					for (int k = 0; k < 8; k++) {
						// 8번 탐색하면서 위,아래,좌,우,대각선4개 0이 아니고 1인경우 false로 바꾸고 for문 탈출 
						if(city[j+dirY[k]][j2+dirX[k]] != 0 && city[j+dirY[k]][j2+dirX[k]] == 1) {
							check = false;
							break;
						}
					}
					// check가 true인 상태일때 해당하는 열과 행의 제일 첫번째 자리부터 
					// M번째 자리까지 반복하면서 2인경우 count를 1씩 늘린다.
					if(check) {
						for (int k = 1; k <= M; k++) {
							if(city[j][k] == 2) {
								count++;
							}
							if(city[k][j2] == 2) {
								count++;
							}
						}
					}
					// count가 중복으로 한번 들어가기때문에 -1을 해주고 max 비교해서 더 큰값을 대입
					max = Math.max(count-1, max);
					count = 0;
					check = true;
				}
			}
			bw.write("#"+(i+1)+" "+max+"\n");
		}
		bw.flush();
	}
}

//1
//6
//G B G G B B
//G B G G B G
//B B B B G B
//B G B B B B
//G B B B B G
//G B B B B G
//5
//G B G G B
//G B G G B
//B B B B G
//B G B B B
//G B B B B
//3
//G G B
//G B B
//B B B
package com.ssafy.hw.day05.step02;

import java.util.Arrays;

/**
 * 영화리스트를 배열로 관리하는 클래스
 * 
 * @author
 *
 */
public class MovieManager {
	//코드를 작성해주세요. 
	
	public static final int MAX_SIZE = 100;
	Movie[] movieList = new Movie[MAX_SIZE];
	int size = 0;
	
	
	public void add(Movie movie) {
		if(size < MAX_SIZE) {
			movieList[size++] = movie;
		}
	}
	
	public Movie[] getList() {
		return Arrays.copyOf(movieList, size);
	}
	
	public Movie searchByTitle(String title) {
		for (int i = 0; i < size; i++) {
			if(movieList[i].getTitle().equals(title)) {
				return movieList[i];
			}
		}
		return null;
	}
}

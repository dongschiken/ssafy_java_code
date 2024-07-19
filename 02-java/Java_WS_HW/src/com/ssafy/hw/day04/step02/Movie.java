package com.ssafy.hw.day04.step02;

public class Movie {
	
	int id;
	String title;
	String director;
	String genre;
	int runningTime;
	
	public Movie(int id, String title, String director, String genre, int runningTime) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}
	
	public Movie() {}
	
	
	void showMovieProfile(int id) {
		if(this.id > 0) {
			System.out.println("영화 이름 :" + title);
			System.out.println("영화 감독 :" + director);
			System.out.println("영화 장르 :" + genre);
			System.out.println("영화 상영시간 :" + runningTime);
		}else {
			System.out.println("해당하는 영화가 없습니다.");
		}
	}
}

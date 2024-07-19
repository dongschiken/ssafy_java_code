package com.ssafy.hw.day05.step02;
public class MovieTest {

	public static void main(String[] args) {
		//코드를 작성해주세요. 
		
		Movie movie1 = new Movie(20240717, "괴물", "봉준호", "액션", 134);
		
		Movie movie2 = new Movie();
		movie2.setId(20240718);
		movie2.setTitle("살인의 추억");
		movie2.setDirector("봉준호");
		movie2.setGenre("스릴러");
		movie2.setRunningTime(126);
		
		MovieManager movieManager = new MovieManager();
		movieManager.add(movie1);
		movieManager.add(movie2);
		
		System.out.println(movieManager.getList()[0]);
		System.out.println(movieManager.getList()[1]);
		System.out.println(movie1.toString());
		System.out.println(movie2.toString());
		System.out.println(movieManager.searchByTitle("괴물"));
	}
}

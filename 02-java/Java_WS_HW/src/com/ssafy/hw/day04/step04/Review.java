package com.ssafy.hw.day04.step04;

public class Review {
	
	int reviewId;
	int resId;
	String writer;
	String content;
	public Review(int reviewId, int resId, String writer, String content) {
		super();
		this.reviewId = reviewId;
		this.resId = resId;
		this.writer = writer;
		this.content = content;
	}
	public Review() {}
	
	@Override
	public String toString() {
		return String.format("Review [reviewId=%d, resId=%d, Writer=%s, content=%s]"
				,reviewId
				,resId
				,writer
				,content
				);
	}
	
	
	
}

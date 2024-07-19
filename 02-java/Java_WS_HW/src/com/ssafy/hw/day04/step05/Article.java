package com.ssafy.hw.day04.step05;

import java.util.Date;

public class Article {
	
	int articleId;
	String title;
	String content;
	int userSeq;
	int viewCnt;
	Date regDate;
	
	public Article(int articleId, String title, String content, int userSeq, int viewCnt, Date regDate) {
		super();
		this.articleId = articleId;
		this.title = title;
		this.content = content;
		this.userSeq = userSeq;
		this.viewCnt = viewCnt;
		this.regDate = regDate;
	}
	public Article() {}
	
	@Override
	public String toString() {
		return String.format("Article [articleId=%d, title=%s, content=%s, usersSeq=%d, viewCnt=%d, regDate=%s]"
				,articleId
				,title
				,content
				,userSeq
				,viewCnt
				,regDate);
	}
	
}

package com.ssafy.hw.day04.step05;

import java.util.Date;

public class Comment {
	int commentId;
	int articleId;
	int userSeq;
	String content;
	Date regDate;
	
	public Comment(int commentId, int articleId, int userSeq, String content, Date regDate) {
		super();
		this.commentId = commentId;
		this.articleId = articleId;
		this.userSeq = userSeq;
		this.content = content;
		this.regDate = regDate;
	}
	public Comment() {}
	
	@Override
	public String toString() {
		return String.format("Comment [commentId=%d, articleId=%d, userSeq=%d, content=%s, regDate=%s]"
				,commentId
				,articleId
				,userSeq
				,content
				,regDate);
	}
}

package com.ssafy.hw.day04.step03;
/**
 * 도서 정보를 나타내는 클래스
 */
public class Book {
	
	String isbn; // 표준 도서번호
	String title;
	String author;
	String publisher;
	int price;
	String desc;
	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}
	
	public Book() {}
	
	@Override
	public String toString() {
		return String.format("%s\t|\t%s\t|\t%s\t|\t%s\t|\t%s\t|\t%s\t|\t" 
				,isbn
				,title
				,author
				,publisher
				,price
				,desc);
	}
	
}


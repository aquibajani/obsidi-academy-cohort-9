package com.bptn.course._10_inheritance.book_application;

public class Novel extends Book {

	String genre;

	public Novel(String book_number, String title, String author, String category, float price, String genre) {
		super(book_number, title, author, category, price);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return super.toString()+"\nNovel [genre=" + genre + "]" + book_number;
	}
	
}

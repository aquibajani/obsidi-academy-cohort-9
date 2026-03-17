package com.bptn.course._10_inheritance.book_application;

public class Book {

	// private - no class outside this class has access. Including no access to child classes.
	// protected - only child classes have access, package visibility
	// public - any class can access even outside of package
	
	public String book_number;
	protected String title;
	private String author;
	String category;
	float price;
	
	public Book(String book_number, String title, String author, String category, float price) {
		this.book_number = book_number;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public String getBook_number() {
		return book_number;
	}
	
	public void setBook_number(String book_number) {
		this.book_number = book_number;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() { 
		return "\nBook [book_number=" + book_number + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}	
	
}

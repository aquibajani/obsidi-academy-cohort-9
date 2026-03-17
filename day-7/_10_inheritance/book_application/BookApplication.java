package com.bptn.course._10_inheritance.book_application;

public class BookApplication {
	
	public static void main(String[] args) {
		Book myBook = new Book("1234", "Test Book", "Test Author", "paperback", (float) 100.00);
		
		Biography myBio = new Biography("5678", "Test Biography", "Biography Author", "hardcover", (float) 70.00, "earth", null);
		
		Novel myNovel = new Novel("7890", "Test Novel", "Novel Author", "ebook", (float) 20.00, "fiction");
		
		System.out.println(myBook);
		System.out.println(myBio);
		System.out.println(myNovel);
		
		myBook.setAuthor("New Author");
		
//		System.out.println("Printing public data from Parent (Book) - " + myBook.book_number);
//		System.out.println("Printing protected data from Parent (Book) - " + myBook.title);
//		System.out.println("Printing private data from Parent (Book) - " + myBook.author);
	}
	
}

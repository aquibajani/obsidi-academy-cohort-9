package com.bptn.course._10_inheritance.book_application;

import java.util.Arrays;

public class Biography extends Book {

	String subject;
	String references[] = new String[5];

	public Biography(String book_number, String title, String author, String category, float price, String subject,
			String[] references) {
		super(book_number, title, author, category, price);
		this.subject = subject;
		this.references = references;
	}
	
//	public void testLogic() {
//		String tempAuthor = this.getAuthor(); 
//	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String[] getReferences() {
		return references;
	}
	
	public void setReferences(String[] references) {
		this.references = references;
	}

	@Override
	public String toString() {
		return super.toString()+"\nBiography [subject=" + subject + ", references=" + Arrays.toString(references) + "]";
	}
	
}

package com.library;

import java.util.Scanner;

public class Book {

	private String author;
	private int isbn;
	private String title;
	private int numberOfPages;
	private int bookQty;
	
	
	
	Scanner input = new Scanner(System.in);
	
	
	public Book() {
		 
		System.out.println("Enter author name:");
		this.author = input.nextLine();
		
		System.out.println("Enter serial No. of Book:");
		this.isbn = input.nextInt();
		
		System.out.println("Enter title of book:");
		this.title = input.nextLine();
		
		System.out.println("Enter number of pages:");
		this.numberOfPages = input.nextInt();
		
		System.out.println("Enter number of boks:");
		this.bookQty = input.nextInt();
	}
	
	
	public Book(String author, int isbn, String title, int numberOfPages, int bookQty) {
		
		super();
		this.author = author;
		this.isbn = isbn;
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.bookQty = bookQty;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	
	
	
	public int getBookQty() {
		return bookQty;
	}


	public void setBookQty(int bookQty) {
		this.bookQty = bookQty;
	}


	@Override
	public String toString() {
		return "Book [author=" + author + ", isbn=" + isbn + ", title=" + title + ", numberOfPages=" + numberOfPages
				+ ", bookQty=" + bookQty + "]";
	}


	
    
	
	
}

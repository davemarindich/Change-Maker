package com.library;

import java.util.Scanner;

public class Branch {

	Book theBooks[] = new Book[50];
	public static int count;
	Book book = null;

	Scanner input = new Scanner(System.in);

	private Book findByTitle(String title) {
		Book book = null;
		for (int i = 0; i < theBooks.length; i++) {
			if (theBooks[i].getTitle().equalsIgnoreCase(title)) {
				book = theBooks[i];
				return book;
			}

		}

		return book;

	}

	private Book findByISBN(int isbn) {
		Book book = null;
		for (int i = 0; i < theBooks.length; i++) {
			if (theBooks[i].getIsbn() == isbn) {
				book = theBooks[i];
				return book;
			}

		}

		return book;

	}
     
	private Book findByAuthor(String authorName) {
		Book book = null;
		for (int i = 0; i < theBooks.length; i++) {
			if (theBooks[i].getAuthor().equalsIgnoreCase(authorName)) {
				book = theBooks[i];
				return book;
			}

		}

		return book;

	}
public void addBook(Book b) {
	if (findByTitle(b.getTitle()) !=null) {
		System.out.println("Book title already exists");
		}
		if(findByISBN(b.getIsbn())!=null){ 
			System.out.println("Book isbn exists");
		if (count < 50) {
			theBooks[count] = b;
			count++;
		} else {
			System.out.println("No space to add more books");
	
			
		}
		}
		
		
 		
}
		public void searchByISBN(){

		    System.out.println("\t\t\t\tSEARCH BY SERIAL NUMBER\n");

		    int isbn;
		    System.out.println("Enter isbn No of Book:");
		    isbn = input.nextInt();
		    
		    
		    Book book = findByISBN(isbn);
		    if (book != null) {
		    	System.out.println(book.getIsbn() + "\t\t" + book.getTitle() + "\t\t" + book.getAuthor() + "\t\t" + 
		                book.getNumberOfPages());
		    } else {
		       System.out.println("No Book for isbn No " + isbn + " Found.");
		    }

		}

		public void searchByAuthorName(){

		    System.out.println("\t\t\t\tSEARCH BY AUTHOR'S NAME");
		    input.nextLine();
		    System.out.println("Enter Author Name:");
		    String authorName = input.nextLine();
		  
		    Book book = findByAuthor(authorName);
		    if (book != null) {
		    	System.out.println(book.getIsbn() + "\t\t" + book.getTitle() + "\t\t" + book.getAuthor() + "\t\t" + 
		                book.getNumberOfPages() );
		    } else {
		       System.out.println("No Book for Author " + authorName + " Found.");
		    }

		}


		public void showAllBooks(){

		    System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
		    System.out.println("ISBN.No\t\tTitle\t\tName\t\tNo of Pages");
		    for (int i=0; i<count; i++){

		    	System.out.println(book.getIsbn() + "\t\t" + book.getTitle() + "\t\t" + book.getAuthor() + "\t\t" + 
		                book.getNumberOfPages() );


		    }

		}

//		public void upgradeBookQty(){
//
//		    System.out.println("\t\t\t\tUPGRADE QUANTITY OF A BOOK\n");
//		    System.out.println("Enter Serial No of Book");
//		    int sNo = input.nextInt();
//		    for (int i=0; i<count; i++){
//
//		        if (sNo == theBooks[i].getIsbn()){
//
//		            System.out.println("Enter No of Books to be Added:");
//		            int addingQty = input.nextInt();
//		            theBooks[i].bookQty += addingQty;
//		            theBooks[i].bookQtyCopy += addingQty;
//		            return;
//
//		        }
//
//		    }
//
//		}


		public void dispMenu(){

		    System.out.println("----------------------------------------------------------------------------------------------------------");
		    System.out.println("Enter 0 to Exit Application.");
		    System.out.println("Enter 1 to Add new Book.");
		    System.out.println("Enter 2 to Upgrade Quantity of a Book.");
		    System.out.println("Enter 3 to Search a Book.");
		    System.out.println("Enter 4 to Show All Books.");
		    System.out.println("Enter 5 to Register Student.");
		    System.out.println("Enter 6 to Show All Registered Students.");
		    System.out.println("Enter 7 to Check Out Book. ");
		    System.out.println("Enter 8 to Check In Book");
		    System.out.println("------------------------------------------------------------- ");

		}

		public int isAvailable(int sNo){

		    //returns the index number if available



		    for (int i=0; i<count; i++){

		        if (sNo == theBooks[i].getIsbn()){
		            if(theBooks[i].getBookQty() > 0 ){

		                System.out.println("Book is Available.");
		                return i;

		            }
		            System.out.println("Book is Unavailable");
		            return -1;

		        }

		    }

		    System.out.println("No Book of Serial Number " + " Available in Library.");
		    return -1;


		}

		public Book checkOutBook(){

		    System.out.println("Enter Serial No of Book to be Checked Out.");
		    int sNo = input.nextInt();

		    int bookIndex =isAvailable(sNo);

		    if (bookIndex!=-1){

		        //int bookIndex = isAvailable(sNo);
		       // theBooks[bookIndex].getBookQty()--;

		        return theBooks[bookIndex];
		    }

		    return null;

		}

		public void checkInBook(Book b){

		    for (int i=0; i<count; i++){

		        if (b.equals(theBooks[i]) ){

		         //   theBooks[i].getBookQty()++;
		            return;

		        }

		    }

		}

		public void upgradeBookQty() {
			// TODO Auto-generated method stub
			
		}

		
	
	}

package com.library;

import java.util.Scanner;

public class Customers {
	
	 	
		Scanner input = new Scanner(System.in);

		Customer theCustomers[] = new Customer[50];

		//books book;


		public static int count = 0;

		public void addStudent(Customer s){

		    for (int i=0; i<count; i++){

		        if(s.getRegNum().equalsIgnoreCase(theCustomers[i].getRegNum())){

		            System.out.println("Student of Reg Num " + s.getRegNum() + " is Already Registered.");
		            return;
		        }

		    }

		    if (count<=50){

		        theCustomers[count] = s;
		        count++;

		    }

		}
		public void showAllStudents(){

		    System.out.println("Student Name\t\tReg Number");
		    for (int i=0; i<count; i++){

		        System.out.println(theCustomers[i].getRegNum() + "\t\t" + theCustomers[i].getRegNum());

		    }


		}

		public int isStudent(){
	 	    
		    System.out.println("Enter Reg Number:");
		    String regNum = input.nextLine();

		    for (int i=0; i<count; i++){

		        if (theCustomers[i].getRegNum().equalsIgnoreCase(regNum)){

		            return i;

		        }

		    }
		    System.out.println("Student is not Registered.");
		    System.out.println("Get Registered First.");


		    return -1;

		}
		public void checkOutBook(Branch book){
		    int studentIndex =this.isStudent();

		    if (studentIndex!=-1){
		        System.out.println("checking out");

		        book.showAllBooks();
		        Book b = book.checkOutBook();
		        System.out.println("checking out");
		        if (b!= null){

		            if (theCustomers[studentIndex].booksCount<=3){
		                System.out.println("adding book");
		                theCustomers[studentIndex].borrowedBooks[theCustomers[studentIndex].booksCount] = b;
		                theCustomers[studentIndex].booksCount++;
		                return;

		            }
		            else {

		                System.out.println("Student Can not Borrow more than 3 Books.");
		                return;

		            }
		        }
		        System.out.println("Book is not Available.");

		    }

		}

		public void checkInBook(Branch book){

		    int studentIndex = this.isStudent();
		    if (studentIndex != -1){
		        System.out.println("S.No\t\t\tBook Name\t\t\tAuthor Name");
		        Customer s = theCustomers[studentIndex];
		        for (int i=0; i<s.booksCount; i++){

		            System.out.println(s.borrowedBooks[i].getIsbn()+ "\t\t\t" + s.borrowedBooks[i].getAuthor() + "\t\t\t"+
		                    s.borrowedBooks[i].getNumberOfPages());

		        }
		        System.out.println("Enter Serial Number of Book to be Checked In:");
		        int sNo = input.nextInt();
		        for (int i=0; i<s.booksCount; i++){

		            if (sNo == s.borrowedBooks[i].getIsbn()){

		                book.checkInBook(s.borrowedBooks[i]);
		                s.borrowedBooks[i]=null;
		                return;

		            }


		        }
		        System.out.println("Book of Serial No "+sNo+"not Found");

		    }



		}

	}
	



package com.library;

import java.util.Scanner;

public class Customer {
	
	
	private String studentName;
	private String regNum;

	Book borrowedBooks[] = new Book[3];
	public int booksCount = 0;

	Scanner input = new Scanner(System.in);
	

	public Customer(){

	    System.out.println("Enter Student Name:");
	    this.studentName = input.nextLine();

	    System.out.println("Enter Reg Number:");
	    this.regNum = input.nextLine();

	}


	


	public String getStudentName() {
		return studentName;
	}





	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}





	public String getRegNum() {
		return regNum;
	}





	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}





	public Customer(String studentName, String regNum) {
		super();
		this.studentName = studentName;
		this.regNum = regNum;
	}
	
	



}

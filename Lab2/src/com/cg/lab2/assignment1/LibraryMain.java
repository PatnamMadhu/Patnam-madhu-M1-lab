package com.cg.lab2.assignment1;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter identification number");
		int id = s.nextInt();
		
		System.out.println("enter no of copies");
		int noOfCopies = s.nextInt();
		
		System.out.println("enter title of book");
		String title = s.next();
		
	Book b = new Book(id,noOfCopies,title);
	
	System.out.println("identification number of the book is "+b.getIdentificatioNumber());
	
	System.out.println("Number of copies of the book is "+b.getNumberOfCopies());
	
	System.out.println("title of the book is "+b.getTitle());
	s.close();
	}

}

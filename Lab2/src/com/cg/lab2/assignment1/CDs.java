package com.cg.lab2.assignment1;

public class CDs extends WrittenItem {

	public CDs(int identificatioNumber, int numberOfCopies, String title) {
		super(identificatioNumber, numberOfCopies, title);      
	}
	
	private String directo;
	private String genre;
	private int yearReleased;
}
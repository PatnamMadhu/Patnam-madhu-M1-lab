package com.cg.lab2.assignment1;



public abstract class WrittenItem extends Item {

	String authorName;
	
	public WrittenItem(int identificatioNumber, int numberOfCopies, String title) {
		super(identificatioNumber, numberOfCopies, title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub

	}

}

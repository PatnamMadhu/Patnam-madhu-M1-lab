package com.cg.lab2.assignment1;

public abstract class Item {
	
	private int identificatioNumber, numberOfCopies;
	private String title;
	
	//Constructor
	
	public Item(int identificatioNumber, int numberOfCopies, String title) {
		super();
		this.identificatioNumber = identificatioNumber;
		this.numberOfCopies = numberOfCopies;
		this.title = title;
	}

	//getter methods
	
	public int getIdentificatioNumber() {
		return identificatioNumber;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public String getTitle() {
		return title;
	}

	//setter methods
	
	public void setIdentificatioNumber(int identificatioNumber) {
		this.identificatioNumber = identificatioNumber;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	abstract public void print();
	
	abstract public void checkIn();
	
	abstract public void checkOut();


}





































































































































/*
 * package com.cg.lab2.assignment1;
 * 
 * public abstract class Item { private int idNumber; private String title,
 * numberOfCopies;
 * 
 * public Item() { super(); }
 * 
 * public Item(int idNumber, String title, String numberOfCopies) { super();
 * this.idNumber = idNumber; this.title = title; this.numberOfCopies =
 * numberOfCopies; }
 * 
 * public int getIdNumber() { return idNumber; }
 * 
 * public void setIdNumber(int idNumber) { this.idNumber = idNumber; }
 * 
 * public String getTitle() { return title; }
 * 
 * public void setTitle(String title) { this.title = title; }
 * 
 * public String getNumberOfCopies() { return numberOfCopies; }
 * 
 * 
 * public void setNumberOfCopies(String numberOfCopies) { this.numberOfCopies =
 * numberOfCopies; }
 * 
 * @Override public String toString() { return "Item [idNumber=" + idNumber +
 * ", title=" + title + ", numberOfCopies=" + numberOfCopies + "]"; }
 * 
 * @Override public boolean equals(Object obj) { if (this == obj) return true;
 * if (obj == null) return false; if (getClass() != obj.getClass()) return
 * false; Item other = (Item) obj; if (idNumber != other.idNumber) return false;
 * if (title == null) { if (other.title != null) return false; } else if
 * (!title.equals(other.title)) return false; return true; } public void print()
 * { System.out.println("IdNumber=" + idNumber + "\n Title=" + title +
 * "\n NumberOfCopies=" + numberOfCopies ); } public abstract void checkOut();
 * public abstract void addItem(); public abstract void checkIn();
 * 
 * }
 */
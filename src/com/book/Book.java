package com.book;

public class Book {
	
	private String name;
	
	private Author author;
	
	private double price;
	
	private int quantity ;
	
	

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public Author getAuthor() {
		return author;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", quantity=" + quantity + ", getAuthor()=" + getAuthor() + "]";
	}
	
	

	public Book(String name, double price, int quantity, Author author) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.author = author;
	}
	
	
	
	
	
	
	
	
	

}

package com.book;

public class Author {
	
	private String name;
	private String email;
	private char gender;
	
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {

		this.email = email;
	}
	public void setGender(char gender) {

		this.gender = gender;
	}
	
	public Author(String name, String i, char gender) {
		//super();
		this.name = name;
		this.email = i;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	
	
	
	

}

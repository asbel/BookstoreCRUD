package org.arpit.java2blog.bean;

public class Book{
	
	int id;
	String title;	
	String author;
		
	public Book() {
		super();
	}
	public Book(int i, String title,long population) {
		super();
		this.id = i;
		this.title = title;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String gettitle() {
		return title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void settitle(String title) {
		this.title = title;
	}
	
	
}
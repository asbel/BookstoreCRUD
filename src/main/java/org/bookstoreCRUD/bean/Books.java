package org.bookstoreCRUD.bean;

import com.sun.xml.txw2.annotation.XmlElement;

public class Books extends Product{
	 private int id;
	private String isbn;
	private String title;
	private String author;
	private String publishedDate;
	private String publisher;
	private String publishedCity; 
	   public void User(){} 
	    
	   public Books(int id, 
			String title,
			String isbn,
			String author,
			String publishedDate,
			String publisher,
			String publishedCity,
			String edition,
			String volume,
			String series){  
	      this.id = id;
	   }  
	   public int getId() { 
	      return id; 
	   }  
	   @XmlElement 
	   public void setId(int id) { 
	      this.id = id; 
	   } 
	   public String getTitle() { 
	      return title; 
	   } 
	   @XmlElement
	   public void setTitle(String title) { 
	      this.title = title; 
	   } 
	   public String getIsbn() { 
	      return isbn; 
	   } 
	   @XmlElement 
	   public void setIsbn(String isbn) { 
	      this.isbn = isbn; 
	   }  
	   public String getAuthor() {
		   return author;
	   }
	   @XmlElement
	   public void setAuthor(String author) {
		   this.author = author;
	   }
	   public String getPublishedDate() { 
		      return publishedDate; 
	   } 
		@XmlElement 
		   public void setPublishedDate(String publishedDate) { 
		      this.publishedDate = publishedDate; 
		}
		public String getPublisher() { 
		      return publisher; 
		   }  
		   @XmlElement 
		   public void setPublisher(String publisher) { 
		      this.publisher = publisher; 
		   } 
		   public String getPublishedCity() { 
		      return publishedCity; 
		   } 
		   @XmlElement
		   public void setPublishedCity(String publishedCity) { 
		      this.publishedCity = publishedCity; 
		   } 
}
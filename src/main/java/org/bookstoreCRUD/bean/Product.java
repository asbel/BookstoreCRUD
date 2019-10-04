package org.bookstoreCRUD.bean;

import com.sun.xml.txw2.annotation.XmlElement;

public class Product {
	private int id; 
	   private String productID; 
	   private String description;  
	   private String distributor;
	   private String location;
	   public Product(){} 
	    
	   public Product(int id, String productID, String description, String distributor, String location){  
	      this.id = id; 
	      this.productID = productID; 
	      this.description = description; 
	      this.distributor = distributor;
	      this.location = location;
	   }  
	   public int getId() { 
	      return id; 
	   }  
	   @XmlElement 
	   public void setId(int id) { 
	      this.id = id; 
	   } 
	   public String getProductID() { 
	      return productID; 
	   } 
	   @XmlElement
	   public void setProductID(String productID) { 
	      this.productID = productID; 
	   } 
	   public String getDescription() { 
	      return description; 
	   } 
	   @XmlElement 
	   public void setDescription(String description) { 
	      this.description = description; 
	   }   
	   public String getDistributor() { 
		      return distributor; 
	   } 
	   @XmlElement 
	   public void setDistributor(String distributor) { 
		this.distributor = distributor; 
		}   
	   public String getLocation() { 
		      return location; 
		   } 
		   @XmlElement 
		   public void setLocation(String location) { 
		      this.location = location; 
		   }   
	} 


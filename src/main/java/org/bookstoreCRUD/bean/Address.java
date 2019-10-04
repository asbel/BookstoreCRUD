package Employees;

import Customer.XmlElement;

public class Address extends Employee{
		private int id; 
		   private String Type;  
		   private String Street;
		   private String State; 
		   private String City;
		   private String Unit;
		   private String Zip;
		   public void User(){} 
		    
		   public void User(int id,
				   String Type,
				   String Street,
				   String State, 
				   String City,
				   String Unit,
				   String Zip) {
			  this.id = id;
		      this.Type = Type;
		      this.Street = Street;
		      this.State = State;
		      this.City = City;
		      this.Unit = Unit;
		      this.Zip = Zip;
		   }  
		   public int getId() { 
		      return id; 
		   }  
		   @XmlElement 
		   public void setId(int id) { 
		      this.id = id; 
		   }   
		   public String Type() { 
			      return Type; 
			   }  
			   @XmlElement 
			   public void setType(String Type) { 
			      this.Type = Type; 
			   } 
			   public String getStreet() { 
			      return Street; 
			   } 
			   @XmlElement
			   public void setStreet(String Street) { 
			      this.Street = Street; 
			   } 
			   public String getState() { 
			      return State; 
			   } 
			   @XmlElement 
			   public void setState(String State) { 
			      this.State = State;     
			   } 
			   public String City() { 
				      return City; 
				   }  
				   @XmlElement 
				   public void setCity(String City) { 
				      this.City = City; 
				   } 
				   public String getUnit() { 
				      return Unit; 
				   } 
				   @XmlElement
				   public void setUnit(String Unit) { 
				      this.Unit = Unit; 
				   } 
				   public String getZip() { 
				      return Zip; 
				   } 
				   @XmlElement 
				   public void setZip(String Zip) { 
				      this.Zip = Zip;     
				   } 
}

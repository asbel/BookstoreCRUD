package Employees;

import Customer.XmlElement;

public class Employee{
	private int id; 
	   private String Department;  
	   private String LastName;
	   private String FirstName; 
	   private String Title;
	   private String EmploymentType;
	   private String Age;
	   public void User(){} 
	    
	   public void User(int id,
			   String Department,
			   String LastName,
			   String FirstName, 
			   String Title,
			   String EmploymentType,
			   String Age) {
		  this.id = id;
	      this.Department = Department;
	      this.LastName = LastName;
	      this.FirstName = FirstName;
	      this.Title = Title;
	      this.Age = Age;
	      this.EmploymentType = EmploymentType;
	   }  
	   public int getId() { 
	      return id; 
	   }  
	   @XmlElement 
	   public void setId(int id) { 
	      this.id = id; 
	   }   
	   public String Department() { 
		      return Department; 
		   }  
		   @XmlElement 
		   public void setDepartment(String Department) { 
		      this.Department = Department; 
		   } 
		   public String getLastName() { 
		      return LastName; 
		   } 
		   @XmlElement
		   public void setLastName(String LastName) { 
		      this.LastName = LastName; 
		   } 
		   public String getFirstName() { 
		      return FirstName; 
		   } 
		   @XmlElement 
		   public void setFirstName(String FirstName) { 
		      this.FirstName = FirstName;     
		   } 
		   public String Title() { 
			      return Title; 
			   }  
			   @XmlElement 
			   public void setTitle(String Title) { 
			      this.Title = Title; 
			   } 
			   public String getAge() { 
			      return Age; 
			   } 
			   @XmlElement
			   public void setAge(String Age) { 
			      this.Age = Age; 
			   } 
			   public String getEmploymentType() { 
			      return EmploymentType; 
			   } 
			   @XmlElement 
			   public void setEmploymentType(String EmploymentType) { 
			      this.EmploymentType = EmploymentType;     
			   } 
}

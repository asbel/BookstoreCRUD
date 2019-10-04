package Customer;

public class CustomerAccount {
private int id; 
	   private String AccountName; 
	   private String AccountPassword; 
	   private String CustomerID; 
	   private String LastName;
	   private String FirstName; 
	   private String CurrentAddress;
	   private String PaymentInfo; 
	   private String AccountCreationDate;
	   private String PreviousOrders; 
	   private String PreviousBrowsing;
	   public void User(){} 
	    
	   public void User(int id,
			   String AccountName,
			   String AccountPassword,
			   String CustomerID,
			   String LastName,
			   String FirstName,
			   String CurrentAddress,
			   String PaymentInfo,
			   String AccountCreationDate,
			   String PreviousOrders,
			   String PreviousBrowsing){  
	      this.id = id; 
	      this.AccountName = AccountName; 
	      this.AccountPassword = AccountPassword; 
	      this.CustomerID = CustomerID;
	      this.LastName = LastName;
	      this.FirstName = FirstName;
	      this.CurrentAddress = CurrentAddress;
	      this.PaymentInfo = PaymentInfo;
	      this.AccountCreationDate = AccountCreationDate;
	      this.PreviousOrders = PreviousOrders;
	      this.PreviousBrowsing = PreviousBrowsing;
	   }  
	   public int getId() { 
	      return id; 
	   }  
	   @XmlElement 
	   public void setId(int id) { 
	      this.id = id; 
	   } 
	   public String getAccountName() { 
	      return AccountName; 
	   } 
	   @XmlElement
	   public void setAccountName(String AccountName) { 
	      this.AccountName = AccountName; 
	   } 
	   public String getAccountPassword() { 
	      return AccountPassword; 
	   } 
	   @XmlElement 
	   public void setAccountPassword(String AccountPassword) { 
	      this.AccountPassword = AccountPassword; 
	   }   
	   public String CustomerID() { 
		      return CustomerID; 
		   }  
		   @XmlElement 
		   public void setCustomerID(String CustomerID) { 
		      this.CustomerID = CustomerID; 
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
			   public String getCurrentAddress() { 
			      return CurrentAddress; 
			   } 
			   @XmlElement
			   public void setCurrentAddress(String CurentAddress) { 
			      this.CurrentAddress = CurentAddress; 
			   } 
			   public String getPaymentInfo() { 
			      return PaymentInfo; 
			   } 
			   @XmlElement 
			   public void setPaymentInfo(String PaymentInfo) { 
			      this.PaymentInfo = PaymentInfo; 
			   } 
				   public String getAccountCreationDate() { 
				      return AccountCreationDate; 
				   } 
				   @XmlElement
				   public void setAccountCreationDate(String AccountCreationDate) { 
				      this.AccountCreationDate = AccountCreationDate; 
				   } 
				   public String getPreviousOrders() { 
				      return PreviousOrders; 
				   } 
				   @XmlElement 
				   public void setPreviousOrders(String PreviousOrders) { 
				      this.PreviousOrders = PreviousOrders; 
				   }
				   public String getPreviousBrowsing() { 
					      return PreviousBrowsing; 
					   } 
					   @XmlElement 
					   public void setPreviousBrowsing(String PreviousBrowsing) { 
					      this.PreviousBrowsing = PreviousBrowsing; 
					   }
}

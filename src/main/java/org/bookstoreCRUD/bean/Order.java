package org.bookstoreCRUD.bean;

public class Order{
	
	int id;
	String OrderName;	
	long population;
	
	public Order() {
		super();
	}
	public Order(int i, String OrderName,long population) {
		super();
		this.id = i;
		this.OrderName = OrderName;
		this.population=population;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderName() {
		return OrderName;
	}
	public void setOrderName(String OrderName) {
		this.OrderName = OrderName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}	
	
}
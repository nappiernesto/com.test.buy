package com.test.buy;

import java.math.BigDecimal;

public abstract class Item {
	
	protected BigDecimal price;
	protected String name;
	protected Boolean imported;
	final static int IMPORT_RATE=5;
	
	public Item(BigDecimal p, String n, Boolean i){
		price = p;
		name = n;
		imported = i;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract int getTaxRate();
	
	public abstract BigDecimal getTotalPrice();
	
	public abstract BigDecimal getTotalTax();

	
	

}

package com.test.buy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	
	List<Item> items = new ArrayList<Item>();
	
	public void addRegularItem(String name, BigDecimal price, Boolean imported){
		Item i = new Regular(price,name,imported);
		items.add(i);
	}
	public void addSpecialItem(String name, BigDecimal price, Boolean imported){
		Item i = new Special(price,name, imported);
		items.add(i);
	}	
	public int getNumberOfItems(){
		return items.size();
	}
	
	public BigDecimal getTotalTax(){
		BigDecimal totalPrice = new BigDecimal(0);
		for (int i = 0; i < items.size(); i++) {
			totalPrice = totalPrice.add(items.get(i).getTotalTax());
		}
		return totalPrice;
	}
	
	public BigDecimal getTotalPrice(){
		BigDecimal totalPrice = new BigDecimal(0);
		for (int i = 0; i < items.size(); i++) {
			totalPrice = totalPrice.add(items.get(i).getTotalPrice());
		}
		return totalPrice;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}

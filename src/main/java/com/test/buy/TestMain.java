package com.test.buy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestMain {
	
	final static boolean IMPORTED = true;
	final static boolean NOT_IMPORTED = false;

	public static void main(String[] args) {
		System.out.println("************* BILL 1 *************\n");
		Cart cart = new Cart();
		cart.addSpecialItem("Book", new BigDecimal(12.49), NOT_IMPORTED);
		cart.addRegularItem("Music CD", new BigDecimal(14.99), NOT_IMPORTED);
		cart.addSpecialItem("Chocolate", new BigDecimal(0.85), NOT_IMPORTED);
		for (int i = 0; i < cart.getItems().size(); i++) {
			Item currentItem = cart.getItems().get(i);
			System.out.println(currentItem.getName()+" at "+currentItem.getTotalPrice());
		}
		System.out.println("\nSales Taxes: "+cart.getTotalTax());
		System.out.println("Total: "+cart.getTotalPrice());
		
		System.out.println("\n************* BILL 2 *************\n");
		Cart cart2 = new Cart();
		cart2.addSpecialItem("Box of chocolates", new BigDecimal(10.00), IMPORTED);
		cart2.addRegularItem("Bottle of perfume", new BigDecimal(47.50), IMPORTED);
		for (int i = 0; i < cart2.getItems().size(); i++) {
			Item currentItem = cart2.getItems().get(i);
			System.out.println(currentItem.getName()+" at "+currentItem.getTotalPrice());
		}
		System.out.println("\nSales Taxes: "+cart2.getTotalTax());
		System.out.println("Total: "+cart2.getTotalPrice());

		System.out.println("\n************* BILL 3 *************\n");
		Cart cart3 = new Cart();
		cart3.addRegularItem("Imported Bottle of perfume", new BigDecimal(27.99), IMPORTED);
		cart3.addRegularItem("Bottle of perfume", new BigDecimal(18.99), NOT_IMPORTED);
		cart3.addSpecialItem("packet of headache pills", new BigDecimal(9.75), NOT_IMPORTED);
		cart3.addSpecialItem("Imported Chocolate", new BigDecimal(11.25), IMPORTED);
		for (int i = 0; i < cart3.getItems().size(); i++) {
			Item currentItem = cart3.getItems().get(i);
			System.out.println(currentItem.getName()+" at "+currentItem.getTotalPrice());
		}
		System.out.println("\nSales Taxes: "+cart3.getTotalTax());
		System.out.println("Total: "+cart3.getTotalPrice());

	}

}

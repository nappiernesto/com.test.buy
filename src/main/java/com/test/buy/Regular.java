package com.test.buy;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.test.utility.TestUtils;

public class Regular extends Item{
	
	final static int RATE=10;
	
	public Regular(BigDecimal p, String n, Boolean i) {
		super(p, n, i);
	}

	@Override
	public int getTaxRate() {
		return RATE;
	}
	
	@Override
	public BigDecimal getTotalPrice() {
		BigDecimal tot = price;
		if(imported)
			tot = tot.add(TestUtils.calculateTax(price, IMPORT_RATE + RATE));
		else
			tot = tot.add(TestUtils.calculateTax(price,RATE));
		return tot.setScale(2, RoundingMode.HALF_EVEN);
	}

	@Override
	public BigDecimal getTotalTax() {
		BigDecimal tot = new BigDecimal(0);
		if(imported)
			tot = tot.add(TestUtils.calculateTax(price, IMPORT_RATE + RATE));
		else
			tot = tot.add(TestUtils.calculateTax(price,RATE));
		return tot;
	}
	
}

package com.test.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestUtils {
	
	
	public static BigDecimal calculateTax(BigDecimal price, int rate){
		BigDecimal tax = price.multiply(new BigDecimal(rate)).divide(new BigDecimal(100));
		return roundTax(tax);
	}
	
	public static BigDecimal roundTax(BigDecimal p){ 
	    BigDecimal t= new BigDecimal("0.05");
	    BigDecimal t2 = p.divide(t);
	    BigDecimal t3 = t2.setScale(0,BigDecimal.ROUND_UP);
	    BigDecimal t4 = t3.multiply(t);
	    return t4;
	}

}

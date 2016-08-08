package com.test.unittest;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;

import com.test.buy.Cart;

public class TestJunit {
	
	Cart cart = new Cart();
	final static boolean IMPORTED = true;
	final static boolean NOT_IMPORTED = false;
   
   
   @Test
   public void testPriceRegular() {	  
      cart.addRegularItem("CD",new BigDecimal(14.99),NOT_IMPORTED);
      assertEquals( new BigDecimal(16.49).setScale(2, RoundingMode.HALF_EVEN),  cart.getItems().get(0).getTotalPrice());
   }
   
   @Test
   public void testPriceRegularImported() {	  
      cart.addRegularItem("Profumo",new BigDecimal(27.99),IMPORTED);
      assertEquals( new BigDecimal(32.19).setScale(2, RoundingMode.HALF_EVEN),  cart.getItems().get(0).getTotalPrice());
   }
   
   @Test
   public void testPriceSpecial() {	  
      cart.addSpecialItem("Book",new BigDecimal(12.49),NOT_IMPORTED);
      assertEquals( new BigDecimal(12.49).setScale(2, RoundingMode.HALF_EVEN),  cart.getItems().get(0).getTotalPrice());
   }
   
   @Test
   public void testPriceSpecialImported() {	  
      cart.addSpecialItem("Cioccolata",new BigDecimal(11.25),IMPORTED);
      assertEquals( new BigDecimal(11.85).setScale(2, RoundingMode.HALF_EVEN),  cart.getItems().get(0).getTotalPrice());
   } 
   
   @Test
   public void testTax() {	  
      cart.addRegularItem("Profumo",new BigDecimal(27.99),IMPORTED);
      cart.addRegularItem("Profumo",new BigDecimal(18.99),NOT_IMPORTED);
      cart.addSpecialItem("Pillole",new BigDecimal(9.75),NOT_IMPORTED);
      cart.addSpecialItem("Cioccolata",new BigDecimal(11.25),IMPORTED);
      assertEquals( new BigDecimal(6.70).setScale(2, RoundingMode.HALF_EVEN), cart.getTotalTax());
   }
   
   @Test
   public void testTotal() {	  
      cart.addRegularItem("Profumo",new BigDecimal(27.99),IMPORTED);
      cart.addRegularItem("Profumo",new BigDecimal(18.99),NOT_IMPORTED);
      cart.addSpecialItem("Pillole",new BigDecimal(9.75),NOT_IMPORTED);
      cart.addSpecialItem("Cioccolata",new BigDecimal(11.25),IMPORTED);
      assertEquals( new BigDecimal(74.68).setScale(2, RoundingMode.HALF_EVEN), cart.getTotalPrice());
   }
   
}
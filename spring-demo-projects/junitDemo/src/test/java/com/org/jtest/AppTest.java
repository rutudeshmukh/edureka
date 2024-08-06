package com.org.jtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.jtest.model.PromoCodes;


import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
/*
public class AppTest  extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     
    public void testApp()
    {
        assertTrue( true );
    }
     public void testAppAgain() {
    	 int expectedCabFare = 500 ;
    	 int actualCabFare = 500;
    	 assertEquals(expectedCabFare, actualCabFare);
     }
  */
  public class AppTest{
	  
	  PromoCodes promoCodes = new PromoCodes();
     @Test
    public void testPromoCode() {
    	assertEquals(true, promoCodes.checkPromoCode("JUMBO"));
    }
     @Test
     public void testDiscount() {
    	 String p = "JUMBO";
    	 double expectedDiscount = 0.4;
    	 assertEquals(expectedDiscount, promoCodes.getDiscount(p));
     }
     
     @Test
     public void testAmountDiscount() {
    	 String pCode = "TRYNEW10";
    	 double amount = 1000;
    	 double expectedAmount = 950.0;
    	 assertEquals(expectedAmount, promoCodes.getAmountAfterDiscountWithTaxes(pCode, amount));
     }
    
     @Test
     public void testAmountDiscountTaxes() {
    	 String pCode = "SUNDAYFUN";
    	 double amount = 1000;
    	 double expectedAmount = 885.0;
    	 assertEquals(expectedAmount, promoCodes.getAmountAfterDiscountWithTaxes(pCode,amount));
     }
}

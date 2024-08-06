package com.org.jtest;

import com.org.jtest.model.PromoCodes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Welcome to Junit");
        PromoCodes p = new PromoCodes();
        System.out.println(p.getDiscount("JUMBO"));
        System.out.println(p.getAmountAfterDiscountWithTaxes("TRYNEW10", 1000));
        System.out.println(p.getAmountAfterDiscountWithTaxes("SUNDAYFUN", 1000));
    }
}

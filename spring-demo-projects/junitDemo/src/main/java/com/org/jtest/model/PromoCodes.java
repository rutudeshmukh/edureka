package com.org.jtest.model;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class PromoCodes {

	
	List<String> promoCodes;
	TreeMap<String, Double> promoCodesWithDiscount;

	public PromoCodes() {
		super();
		// TODO Auto-generated constructor stub
		promoCodes = Arrays.asList("JUMBO" , "BINGO","HAPPY50","TRYNEW10","SUNDAYFUN");
		promoCodesWithDiscount = new TreeMap<String, Double>();
		promoCodesWithDiscount.put(promoCodes.get(0), 0.40);
		promoCodesWithDiscount.put(promoCodes.get(1), 0.20);
		promoCodesWithDiscount.put(promoCodes.get(2), 0.50);
		promoCodesWithDiscount.put(promoCodes.get(3), 0.90);
		promoCodesWithDiscount.put(promoCodes.get(4), 0.25);
	}

   public Double getDiscount(String promoCodes) {
	   return promoCodesWithDiscount.containsKey(promoCodes)?promoCodesWithDiscount.get(promoCodes):0.05;
   }
	
	public Double getDiscountAfterAmountDiscount(String promoCode , double amount) {
		return promoCodesWithDiscount.containsKey(promoCode)?(amount- amount*promoCodesWithDiscount.get(promoCode)):(amount- amount*0.05);
	}
	
	public Double  getAmountAfterDiscountWithTaxes(String promoCodes , double amount) {
		double amountAfterDiscount = getDiscountAfterAmountDiscount(promoCodes, amount);
		return (amountAfterDiscount +(0.18*amountAfterDiscount));
		
	}
	
	public  boolean checkPromoCode(String promoCode) {
		return promoCodes.contains(promoCode.toUpperCase());
	}
	
	
	
}

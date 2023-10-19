package com.leniolabs.challenge.calculator.factory;


import org.springframework.stereotype.Component;

import com.leniolabs.challenge.calculator.CorporateAccountFeeCalculator;
import com.leniolabs.challenge.calculator.FeeCalculatorIF;
import com.leniolabs.challenge.calculator.PersonalAccountFeeCalculator;

/**
 * @author USAR
 *
 */
@Component
public class FeeCalculatorFactory {
	
	private String accountType = "personal"; // Default value
	private FeeCalculatorIF feeCalculator;
	
	/*
	 * Return feed acunt acordin to type acount when create the class object
	 */
	public  FeeCalculatorIF getFeeCalculator() {
		return feeCalculator;
	}
	
	/*
	 * Creates the Feed Calculator according to account type property
	 */
	@SuppressWarnings("unused")
	private void setFeeCalculator(FeeCalculatorIF feeCalculator) {
		if(this.accountType.equals("personal")) this.feeCalculator = new PersonalAccountFeeCalculator();
		else if(this.accountType.equals("corporate")) this.feeCalculator = new CorporateAccountFeeCalculator();
	}

	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
   
    
}

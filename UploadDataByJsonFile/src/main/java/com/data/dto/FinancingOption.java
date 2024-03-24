package com.data.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FinancingOption {

	private double down_payment_percentage;
	private double loan_apr;
	private int loan_term;
	public FinancingOption(double downPaymentPercentage, double loanApr, int loanTerm) {
		super();
		this.down_payment_percentage = downPaymentPercentage;
		this.loan_apr = loanApr;
		this.loan_term = loanTerm;
	}

	
}

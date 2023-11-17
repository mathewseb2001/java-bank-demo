package com.ilp.entity;

import java.util.ArrayList;

public class LoanAccount extends Product {
 private double depositCharge=0.03;
	public double getDepositCharge() {
	return depositCharge;
}
public void setDepositCharge(double depositCharge) {
	this.depositCharge = depositCharge;
}
	public LoanAccount(String productCode, String productName, ArrayList<Services> serviceList) {
		super(productCode, productName, serviceList);
		// TODO Auto-generated constructor stub
	}


}

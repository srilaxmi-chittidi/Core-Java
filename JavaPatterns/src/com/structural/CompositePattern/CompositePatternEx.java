package com.structural.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class CompositePatternEx {
	public static void main(String[] args) {
		CompositeAccount ca = new CompositeAccount();
		ca.addAccount(new DepositeAccount("101", 15482));
		ca.addAccount(new DepositeAccount("102", 875412));
		ca.addAccount(new SavingsAccount("103", 78542));
		ca.addAccount(new SavingsAccount("104", 986523));
		
		float totalBalance = ca.getBalance();
		System.out.println("Total Balance is : "+totalBalance);
	}
}
abstract class Account{
	public abstract float getBalance();
}
class DepositeAccount extends Account{
	private String accountNo;
	private float accountBalance;
	public DepositeAccount(String accountNo,float accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}
	@Override
	public float getBalance() {
		return accountBalance;
	}
}
class SavingsAccount extends Account{
	private String accountNo;
	private float accountBalance;
	public SavingsAccount(String accountNo,float accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}
	@Override
	public float getBalance() {
		return accountBalance;
	}	
}
class CompositeAccount extends Account{
	private float totalBalance;
	private List<Account> accList = new ArrayList<>();
	@Override
	public float getBalance() {
		totalBalance = 0;
		for(Account acc : accList) {
			totalBalance = totalBalance + acc.getBalance();
		}
		return totalBalance;
	}
	public void addAccount(Account a) {
		accList.add(a);
	}
	public void removeAccount(Account a) {
		accList.remove(a);
	}

}
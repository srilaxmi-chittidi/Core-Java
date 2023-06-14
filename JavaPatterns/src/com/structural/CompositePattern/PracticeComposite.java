package com.structural.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class PracticeComposite {

	public static void main(String[] args) {
		CompositeAccount ca = new CompositeAccount();
		ca.addAccount(new DepositeAccount("101", 15482));
		ca.addAccount(new DepositeAccount("102", 875412));
		ca.addAccount(new SavingsAccount("103", 78542));
		ca.addAccount(new SavingsAccount("104", 986523));
		
		System.out.println(ca.getBalance());
	}

}
abstract class Account1{
	public abstract float getBalance();
}
class SavingsAccount1 extends Account1{
	private String accountNo;
	private float accountBalance;
	
	public SavingsAccount1(String accountNo,float accountBalance) {
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
				
	}
	@Override
	public float getBalance() {
		return this.accountBalance;
	}
	
}
class DepositeAccount1 extends Account1{

	private String accountNo;
	private float accountBalance;
	
	public DepositeAccount1(String accountNo,float accountBalance) {
		this.accountBalance = accountBalance;
		this.accountNo = accountNo;
	}
	@Override
	public float getBalance() {
		return this.accountBalance;
	}
}
class CompositeAccount1 extends Account1{

	private float totalBalance;
	private List<Account1> accountsList;
	
	public CompositeAccount1() {
		accountsList = new ArrayList<>();
	}
	@Override
	public float getBalance() {
		totalBalance = 0;
		for(Account1 acc : accountsList) {
			totalBalance = totalBalance+acc.getBalance();
		}
		return totalBalance;
	}
	private void addAccounts(Account1 acc) {
		 accountsList.add(acc);
	}
	private void removeAccount(Account1 acc) {
		accountsList.remove(acc);
	}
	
}
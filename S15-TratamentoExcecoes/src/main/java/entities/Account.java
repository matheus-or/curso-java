package entities;

import entities.expection.WithdrawException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance+=amount;
	}
	
	public void withdraw(Double amount) throws WithdrawException {
		
		if (amount > this.withdrawLimit) {
			throw new WithdrawException("Withdraw error: The amount exceeds withdraw limit");
		}
		
		if (amount > this.balance) {
			throw new WithdrawException("Withdraw error: not enoght balance");
		}
		
		this.balance-=amount;
	}

}

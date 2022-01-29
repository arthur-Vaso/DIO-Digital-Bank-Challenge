package com.dio.model;

import com.dio.main.Run;

public class Bank {

	private String bank;
	private Account account;

	public Bank() {
	}

	public Bank(String bank, Account account, Run run) {
		this.bank = bank;
		this.account = account;
		System.out.println(this);

		run.setBanks(this);
	}

	public Bank(String bank) {
		this.bank = bank;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public Account getaccount() {
		return account;
	}

	public void setaccounts(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "\nBanco: " + bank + "\nTitular: " + account.client + "\nConta: " + account.number
				+ "\nAgência: " + account.agency + "\nSaldo R$ " + account.balance;
	}

}

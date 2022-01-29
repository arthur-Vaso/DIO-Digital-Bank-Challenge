package com.dio.model;

import com.dio.interfaces.AccountInterface;
import com.dio.main.Run;

public abstract class Account implements AccountInterface {

	private static final int DEFAULT_AGENCY = 1;
	private static int SEQUENCE = 1;

	protected int agency;
	protected int number;
	protected double balance;
	protected Client client;

	public Account() {
	}

	public Account(Client client, String bank, Run run) {
		this.agency = Account.DEFAULT_AGENCY;
		this.number = SEQUENCE++;
		this.client = client;

		Bank ba = new Bank(bank, this, run);
	}

	@Override
	public void withdraw(double value) {
		if (!checkLimit(value, "retirado")) {
			this.balance -= value;
		}
	}

	@Override
	public void deposit(double value) {
		this.balance += value;
	}

	@Override
	public void transfer(double value, AccountInterface destinationAccount) {
		if (!checkLimit(value, "transferido")) {
			this.withdraw(value);
			destinationAccount.deposit(value);
		}
	}

	protected void printCommonInformation() {
		System.out.println(String.format("Titular: %s", this.client.getName()));
		System.out.println(String.format("Agencia: %d", this.agency));
		System.out.println(String.format("Numero: %d", this.number));
		System.out.println(String.format("Saldo: %.2f", this.balance));
	}

	private boolean checkLimit(double value, String action) {
		if (value > this.balance) {
			System.out.print("\nO valor a ser " + action + " excedeu o limite da conta.\n\n");
			return true;
		}
		return false;
	}

}

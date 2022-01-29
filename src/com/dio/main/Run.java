package com.dio.main;

import java.util.ArrayList;
import java.util.List;

import com.dio.model.Account;
import com.dio.model.Bank;
import com.dio.model.CheckingAccount;
import com.dio.model.Client;
import com.dio.model.SavingsAccount;

public class Run {
	public List<Bank> banks;

	public Run() {
		banks = new ArrayList<Bank>();

		Client c1 = new Client("Arthur");

		Account ca = new CheckingAccount(c1, "Banco DIO", this);
		Account sa = new SavingsAccount(c1, "Itaú", this);

		ca.deposit(100);
		ca.printExtract();

		ca.transfer(20, sa);
		ca.printExtract();

		ca.withdraw(30);
		ca.printExtract();

		sa.printExtract();

		sa.transfer(21, ca);

		sa.deposit(15);
		sa.printExtract();

		sa.withdraw(150);
		sa.printExtract();

		for (int i = 0; i < banks.size(); i++) {
			System.out.println(banks.get(i));
		}
	}

	public List<Bank> getBanks() {
		return banks;
	}

	public void setBanks(Bank bank) {
		this.banks.add(bank);
	}

}

package com.dio.model;

import com.dio.main.Run;

public class CheckingAccount extends Account {

	public CheckingAccount(Client client, String bank, Run run) {
		super(client, bank, run);
	}

	@Override
	public void printExtract() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.printCommonInformation();
	}
}

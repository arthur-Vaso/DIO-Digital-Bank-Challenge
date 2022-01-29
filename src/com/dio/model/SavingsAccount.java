package com.dio.model;

import com.dio.main.Run;

public class SavingsAccount extends Account {

	public SavingsAccount(Client client, String bank, Run run) {
		super(client, bank, run);
	}

	@Override
	public void printExtract() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.printCommonInformation();
	}

}

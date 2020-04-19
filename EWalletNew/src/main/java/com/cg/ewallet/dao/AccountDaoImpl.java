package com.cg.ewallet.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.ewallet.bean.Account;
import com.cg.ewallet.bean.Customer;

public class AccountDaoImpl implements AccountDao {

	public static ArrayList<Account> accList = new ArrayList<Account>();
	public static HashMap<String, Account> accHash = new HashMap<String, Account>();

	public void addAccount(Account account, Customer customer) {
		accList.add(account);
		accHash.put(customer.getUsername(), account);
	}

	public void fetchBalance(String user) {

		accList.stream().filter(x -> x.getCust().getUsername().equals(user)).forEach(x -> {
			System.out.println(x.getBalance());
		});

	}

	@Override
	public void deposit(String user, double amount) {

		accList.stream().filter(x -> x.getCust().getUsername().equals(user)).forEach(x -> {
			x.setBalance(x.getBalance() + amount);
		});
	}

	@Override
	public void withdraw(String user, double amount) {
		accList.stream().filter(x -> x.getCust().getUsername().equals(user)).forEach(x -> {
			x.setBalance(x.getBalance() - amount);
		});
	}

	@Override
	public void fundtransfer(String user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void gettransaction(String user) {
		// TODO Auto-generated method stub

	}

}

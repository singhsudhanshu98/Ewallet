package com.cg.ewallet.service;

import com.cg.ewallet.bean.Account;
import com.cg.ewallet.bean.Customer;
import com.cg.ewallet.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {

	AccountDaoImpl dao = new AccountDaoImpl();

	public void addAccount(Account account, Customer customer) {
		dao.addAccount(account, customer);
	}

	public void fetchBalance(String user) {
		dao.fetchBalance(user);

	}

	public void deposit(String user, double amount) {
		dao.deposit(user,amount);
	}

	public void withdraw(String user, double amount) {
		dao.withdraw(user,amount);
		
	}

	public void fundtransfer(String user) {
		// TODO Auto-generated method stub
		
	}
	public void gettransaction(String user) {
		// TODO Auto-generated method stub
		
	}
	
}

package com.cg.ewallet.service;

import com.cg.ewallet.bean.Account;
import com.cg.ewallet.bean.Customer;

public interface AccountService {
	void addAccount(Account account,Customer customer);
	void fetchBalance(String user);
	void deposit(String user,double amount);
	void withdraw(String user,double amount);
	void fundtransfer(String user);
	void gettransaction(String user);
}

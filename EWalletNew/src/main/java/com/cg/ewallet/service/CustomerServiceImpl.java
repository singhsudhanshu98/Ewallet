package com.cg.ewallet.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.ewallet.bean.Customer;
import com.cg.ewallet.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService{

	CustomerDaoImpl dao = new CustomerDaoImpl();
	public void addCustomer(Customer customer) {
		dao.addCustomer(customer);
	}
	
}

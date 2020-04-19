package com.cg.ewallet.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.ewallet.bean.Customer;

public class CustomerDaoImpl implements CustomerDao{

	public static ArrayList<Customer> custList = new ArrayList<Customer>();
	public static HashMap<Customer,String> custHash = new HashMap<Customer,String>();
	public static ArrayList<Customer> getCustList() {
		return custList;
	}
	public static void setCustList(ArrayList<Customer> custList) {
		CustomerDaoImpl.custList = custList;
	}
	public static HashMap<Customer, String> getCustHash() {
		return custHash;
	}
	public static void setCustHash(HashMap<Customer, String> custHash) {
		CustomerDaoImpl.custHash = custHash;
	}
	public void addCustomer(Customer customer) {
		custList.add(customer);
		custHash.put(customer, customer.getPassword());
	}
	
}

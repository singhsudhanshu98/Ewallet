package com.cg.ewallet.ui;

import java.util.Scanner;

import com.cg.ewallet.bean.Account;
import com.cg.ewallet.bean.Customer;
import com.cg.ewallet.dao.CustomerDaoImpl;
import com.cg.ewallet.service.AccountServiceImpl;
import com.cg.ewallet.service.CustomerServiceImpl;
import com.cg.ewallet.validate.ApplicationDataValidate;

public class ewalletDemo {
	public static void main(String[] args) {
		CustomerDaoImpl cdi = new CustomerDaoImpl();
		CustomerServiceImpl csi = new CustomerServiceImpl();
		AccountServiceImpl asi = new AccountServiceImpl();
		ApplicationDataValidate validate = new ApplicationDataValidate();
		Scanner scr = new Scanner(System.in);
		while (true) {
			System.out.println("1. Create Account\n" + "2. Login\n" + "3. Exit");
			int opt = scr.nextInt();
			scr.nextLine();
			switch (opt) {
			case 1:
				String customerName, username, password, email, contact, age, gender, aadhar, address;
				while (true) {
					System.out.println("Enter Customer Name");
					customerName = scr.nextLine();
					boolean flag = validate.validateCustomerName(customerName);
					if (flag)
						break;
				}
				while (true) {
					System.out.println("Enter UserName: ");
					username = scr.nextLine();
					boolean flag = validate.validateUsername(username);
					if (flag)
						break;
				}
				while (true) {
					System.out.println("Set your password: ");
					password = scr.nextLine();
					boolean flag = validate.validatePassword(password);
					if (flag)
						break;
				}
				while (true) {
					System.out.println("Enter your mail ID: ");
					email = scr.nextLine();
					boolean flag = validate.validateMail(email);
					if (flag)
						break;
				}

				System.out.println("Enter your phone number: ");
				contact = scr.nextLine();
				while (true) {
					System.out.println("Enter your age: ");
					age = scr.nextLine();
					boolean flag = validate.validateAge(Integer.parseInt(age));
					if (flag)
						break;
				}
				while (true) {
					System.out.println("Enter your gender: ");
					gender = scr.nextLine();
					boolean flag = validate.validateGender(gender);
					if (flag)
						break;
				}

				System.out.println("Enter your Aadhar: ");
				aadhar = scr.nextLine();

				System.out.println("Enter your Address: ");
				address = scr.nextLine();

				long accNum = (long) (Math.random() * 1234 + 9999);

				Customer customer = new Customer();

				customer.setCustomerName(customerName);
				customer.setUsername(username);
				customer.setPassword(password);
				customer.setEmail(email);
				customer.setContact(contact);
				customer.setAge(age);
				customer.setGender(gender);
				customer.setAadharNum(aadhar);
				customer.setAddress(address);
				csi.addCustomer(customer);

				Account account = new Account();
				account.setAccNum(accNum);
				account.setBalance(0);
				account.setCust(customer);
				account.setiFSC("1AZ23D");
				account.setBranch("Financial District Branch");
				asi.addAccount(account, customer);
				System.out.println("Account Created Successfully");
				break;
			case 2:
				System.out.println("Enter Username: ");
				String uname = scr.next();
				System.out.println("Enter Password: ");
				String pass = scr.next();
				String admin = null;
				boolean login = false;
				for (Customer c : CustomerDaoImpl.getCustList()) {
					if (c.getUsername().equals(uname) && c.getPassword().equals(pass)) {
						admin = c.getCustomerName();
						login = true;
						break;
					}
				}
				if (login == true) {
					System.out.println("Welcome " + admin);
					System.out.println("1. Show Balance\n" + "2. Deposit\n" + "3. Withdraw\n" + "4. FundTransfer\n"
							+ "5. Print Transaction\n" + "6. Exit\n");
					System.out.println("Enter your choice ");
					int opt1 = scr.nextInt();
					scr.nextLine();
					switch (opt1) {
					case 1:
						asi.fetchBalance(uname);
						break;
					case 2:
						System.out.println("Enter amount");
						double damount = scr.nextDouble();
						asi.deposit(uname, damount);
						break;
					case 3:
						System.out.println("Enter amount");
						double wamount = scr.nextDouble();
						asi.withdraw(uname, wamount);
						break;
					}

				}
			}
		}
	}
}

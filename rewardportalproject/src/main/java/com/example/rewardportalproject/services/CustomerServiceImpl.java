package com.example.rewardportalproject.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rewardportalproject.entities.Customers;

@Service
public class CustomerServiceImpl implements CustomersService {
	
	List<Customers> customerList;
	public CustomerServiceImpl() {
		
		   customerList = Arrays.asList(new Customers(1011,"Joseph"),
                new Customers(1022,"Daniel"),
                new Customers(1023,"Mary"),
                new Customers(1024,"Joy"),
                new Customers(1025,"Riyan"),
                new Customers(1026,"Rajan"));
	}

	@Override
	public List<Customers> getCustomers() {
	
		return customerList;
	}

}

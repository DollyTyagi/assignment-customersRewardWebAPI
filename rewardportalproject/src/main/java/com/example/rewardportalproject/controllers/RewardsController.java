package com.example.rewardportalproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rewardportalproject.entities.Customers;
import com.example.rewardportalproject.entities.TransactionsRecord;
import com.example.rewardportalproject.services.CustomersService;
import com.example.rewardportalproject.services.TransactionsRecordService;


@RestController
@RequestMapping("/customer-rewards")
public class RewardsController {
	
	@Autowired
	private CustomersService customerService;
	
	@Autowired
	private TransactionsRecordService transactionRecordService;
	
	
	@GetMapping("/monthRecords/{}")
	public List<TransactionsRecord> getMonthlyRecords(@PathVariable long id , @RequestParam String month) {
		return this.transactionRecordService.getMonthlyTransactionRecord(id, month);
	}

	
	@GetMapping("/customers")
	public List<Customers> getCustomers() {
		return this.customerService.getCustomers();
	}

}

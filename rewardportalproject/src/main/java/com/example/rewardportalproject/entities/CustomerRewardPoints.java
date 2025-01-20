package com.example.rewardportalproject.entities;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;


@Entity
public class CustomerRewardPoints {
	
	@Autowired
	Customers customer;
	
	@Autowired
	TransactionsRecord transacRecord;
	
	Long rewardPoints;

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public TransactionsRecord getTransacRecord() {
		return transacRecord;
	}

	public void setTransacRecord(TransactionsRecord transacRecord) {
		this.transacRecord = transacRecord;
	}

	public Long getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(Long rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public CustomerRewardPoints(Customers customer, TransactionsRecord transacRecord, Long rewardPoints) {
		super();
		this.customer = customer;
		this.transacRecord = transacRecord;
		this.rewardPoints = rewardPoints;
	}
	
	
	

}

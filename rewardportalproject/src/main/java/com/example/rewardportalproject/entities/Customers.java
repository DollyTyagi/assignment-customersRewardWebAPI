package com.example.rewardportalproject.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customers {
	
	@Id
	private int id;
	
	@Column
	private String customerName;
	
	@OneToMany (mappedBy = "customer", cascade = CascadeType.ALL)
	private List<TransactionsRecord> transactionRecords;
	
	
	public Customers(int id, String customerName, List<TransactionsRecord> transactionRecords) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.transactionRecords = transactionRecords;
	}

	public List<TransactionsRecord> getTransactionRecords() {
		return transactionRecords;
	}

	public void setTransactionRecords(List<TransactionsRecord> transactionRecords) {
		this.transactionRecords = transactionRecords;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Customers(int id, String customerName) {
		super();
		this.id = id;
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", customerName=" + customerName + "]";
	}
	
	
	
	
}
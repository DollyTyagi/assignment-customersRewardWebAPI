package com.example.rewardportalproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.rewardportalproject.entities.TransactionsRecord;


public interface TransactionRepository extends JpaRepository<TransactionsRecord , Integer>{
	
	@Query("SELECT Customer.* , TransactionsRecord.* from Customers Join TransactionsRecord ON Customers.id == TransactionsRecord.customId")
    List<TransactionsRecord> findByCustomerAndMonth(Long customerId, String month);

}

package com.example.rewardportalproject.services;

import java.time.LocalDate;
import java.util.List;

import com.example.rewardportalproject.entities.TransactionsRecord;

public interface TransactionsRecordService {
	
	public List<TransactionsRecord> getMonthlyTransactionRecord(Long transacID , String month);

}

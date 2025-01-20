package com.example.rewardportalproject.services;

import java.util.List;

import com.example.rewardportalproject.dao.TransactionRepository;
import com.example.rewardportalproject.entities.TransactionsRecord;

public class TransactionsRecordServiceImpl implements TransactionsRecordService{
	
	private TransactionRepository transactionRepo;

	@Override
	public List<TransactionsRecord> getMonthlyTransactionRecord(Long transacID, String month) {
		 return transactionRepo.findByCustomerAndMonth(transacID, month);
	}
	
	public void TransactionsRecordService(TransactionRepository transactionRepos) {
        this.transactionRepo = transactionRepos;
    }

}

package com.example.rewardportalproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rewardportalproject.entities.CustomerRewardPoints;
import com.example.rewardportalproject.entities.Customers;
import com.example.rewardportalproject.entities.TransactionsRecord;


@Service
public class CustomerRewardPointsServiceImpl implements CustomerRewardPointsService{
	
	
	@Autowired
	TransactionsRecord transacRecord;
	
	@Autowired
	CustomerRewardPoints rewardPoints;
    
	@Override
	public CustomerRewardPoints calculateRewardPoints(Customers customer , String month) {
		
		if(month == "January" && customer.getId() == transacRecord.getCustomer().getId()) {
			if(transacRecord.getDollar() >= 50 || transacRecord.getDollar() <= 100) {
				rewardPoints.setRewardPoints(rewardPoints.getRewardPoints() + transacRecord.getDollar() * 1);
			}
			else if(transacRecord.getDollar() >100) {
				rewardPoints.setRewardPoints(rewardPoints.getRewardPoints() + transacRecord.getDollar() * 2);
			}
		}
		return rewardPoints;
	}	

}
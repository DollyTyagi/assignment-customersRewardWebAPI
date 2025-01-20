package com.example.rewardportalproject.services;

import com.example.rewardportalproject.entities.CustomerRewardPoints;
import com.example.rewardportalproject.entities.Customers;

public interface CustomerRewardPointsService {
	
	public CustomerRewardPoints calculateRewardPoints(Customers customer , String month);

}

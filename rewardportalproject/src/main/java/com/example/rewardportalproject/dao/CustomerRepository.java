package com.example.rewardportalproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rewardportalproject.entities.Customers;

public interface CustomerRepository extends JpaRepository<Customers , Integer> {
	
	

}

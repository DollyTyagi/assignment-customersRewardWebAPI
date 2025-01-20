package com.example.rewardportalproject.entities;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionsRecord {
	
	@Id
	private int transacID;
	@Column
	private String months;
	@Column
	private long dollar;
	@Column
	private LocalDate date;
	
	@ManyToOne
    @JoinColumn(name = "id")
    private Customers customer;
	


}
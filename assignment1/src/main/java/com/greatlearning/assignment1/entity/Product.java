package com.greatlearning.assignment1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pno;
	
	@Column(name="productname")
	private String pname;
	
	@Column(name="quantity")
	private int qty;
	
	@Column(name="unitprice")
	private double price;

	
	
	
	
}

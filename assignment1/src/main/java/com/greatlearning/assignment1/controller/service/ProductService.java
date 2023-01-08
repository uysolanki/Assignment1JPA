package com.greatlearning.assignment1.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.assignment1.entity.Product;
import com.greatlearning.assignment1.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository prorepo;
	public void addProduct(Product product)
	{
		prorepo.save(product);
	}
}

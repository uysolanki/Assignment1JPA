package com.greatlearning.assignment1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.assignment1.controller.response.MyResponse;
import com.greatlearning.assignment1.controller.service.ProductService;
import com.greatlearning.assignment1.entity.Product;

@RestController
@RequestMapping(value="/flipkart") //optional
public class ProductController {
	@Autowired
	ProductService service;
	
	@GetMapping(value="/addproduct")
	public MyResponse addProduct(@RequestParam("pno") int pno,
			@RequestParam("pname") String pname,
			@RequestParam("qty") int qty,
			@RequestParam("price") double price)
			{
		MyResponse response=new MyResponse();
		
		Product product=new Product();
		product.setPno(pno);
		product.setPname(pname);
		product.setQty(qty);
		product.setPrice(price);
		try
		{
		service.addProduct(product);
		response.setMessage("Record Inserted Successfully");
		response.setStatus(true);
		response.setStatuscode(HttpStatus.OK);
		}
		catch(Exception e) {}
	
		return response;
	}
}

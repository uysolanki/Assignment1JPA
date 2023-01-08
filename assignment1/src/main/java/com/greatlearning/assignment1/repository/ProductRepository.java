package com.greatlearning.assignment1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.assignment1.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}

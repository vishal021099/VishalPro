package com.example.demo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.model.Product;

public interface PRepository extends PagingAndSortingRepository<Product, Integer> {

}

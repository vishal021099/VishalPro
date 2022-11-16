package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Product;

public interface PPagService {

	List<Product> getAllEmployees(Integer pageNo, Integer pageSize);
}

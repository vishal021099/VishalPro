package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Category;


public interface CPagService {
	
	

	List<Category> getAllEmployees(Integer pageNo, Integer pageSize);

}

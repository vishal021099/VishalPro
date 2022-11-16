package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;

import com.example.demo.repo.CPagRepository;
import com.example.demo.repo.CPagService;
import com.example.demo.repo.CRepository;



@Service
public class CategoryService implements CPagService {
	
	@Autowired
	private CRepository r3;
	
	
	@Autowired
	private CPagRepository y1;
	
	public List<Category> listAll()
	{
		return r3.findAll();
		
	}
	
	public Category save(Category c1)
	{
		return r3.save(c1);
	}
	
	public Category get(Integer id)
	{
		return r3.findById(id).get();
	}
	
	public void delete(Integer id)
	{
		r3.deleteById(id);
	}
	public void update(Category c1, Integer id)   
	{  
	r3.save(c1);  
	}

	

	
	
	 public List<Category> getAllEmployees(Integer pageNo, Integer pageSize)
	    {
	        Pageable paging = PageRequest.of(pageNo, pageSize);
	 
	        Page<Category> pagedResult = y1.findAll(paging);
	         
	        if(pagedResult.hasContent()) {
	            return pagedResult.getContent();
	        } else {
	            return new ArrayList<Category>();
	        }
	    }
	
	
	
	
	
	
	
	
}

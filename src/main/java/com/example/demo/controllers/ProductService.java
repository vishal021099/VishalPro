package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.PPagRepository;
import com.example.demo.repo.PPagService;

import com.example.demo.repo.Repository;

@Service
public class ProductService implements PPagService {
	
	
	@Autowired
	private Repository r2;
	
	@Autowired
	private PPagRepository y1;
	
	public List<Product> listAll()
	{
		return r2.findAll();
		
	}
	
	public Product save(Product p1)
	{
		return r2.save(p1);
	}
	
	public Product get(Integer id)
	{
		return r2.findById(id).get();
	}
	
	public void delete(Integer id)
	{
		r2.deleteById(id);
	}
	public void update(Product p1, Integer id)   
	{  
	r2.save(p1);  
	}

	public List<Product> getAllEmployees(Integer pageNo, Integer pageSize)
    {
        Pageable paging = PageRequest.of(pageNo, pageSize);
 
        Page<Product> pagedResult = y1.findAll(paging);
         
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Product>();
        }
    }
	
		
	

	

	
	
	
}

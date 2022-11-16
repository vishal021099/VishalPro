package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repo.CPagService;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class CategoryController {

 
	@Autowired
	private CategoryService r4;
	
	@Autowired
	 private CPagService y2;
	
	
	 @GetMapping("/categories")
	    public ResponseEntity<List<Category>> getAllEmployees(
	                        @RequestParam(defaultValue = "1") Integer pageNo, 
	                        @RequestParam(defaultValue = "2") Integer pageSize)
	               
	    {
	        List<Category> list = y2.getAllEmployees(pageNo, pageSize);
	 
	        return new ResponseEntity<List<Category>>(list, new HttpHeaders(), HttpStatus.OK); 
	    }
	
	
	
	
	
	
	
	
	
	
	 
	@GetMapping("/categories/{di}")
	public Category get(@PathVariable Integer di)
	{
		return r4.get(di);
	}
	
	@PostMapping("/categories")
		public String add(@RequestBody Category c2)
		{
		
		r4.save(c2);
		return "save";
	}
	
	 @PutMapping("/categories/{di}")
	  public ResponseEntity<Category> updateTutorial(@PathVariable Integer di, @RequestBody Category c2) {
	    Category c3 = r4.get(di);
	    
	   
	    c3.setName(c2.getName());
	   
	      
	      
	   Category updateP = r4.save(c3);
	    
	    
	     return ResponseEntity.ok().body(updateP);
	     
	  }

	
	
	
	@DeleteMapping("/categories/{di}")
	public void delete(@PathVariable Integer di)
	{
		r4.delete(di);
	}
	

}

package com.example.demo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.model.Category;


public interface CPagRepository extends PagingAndSortingRepository<Category, Integer> {

}

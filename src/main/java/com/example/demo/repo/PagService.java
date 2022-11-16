package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Product;

public interface PagService {

	List<Product> findPaginated(int pageNo, int pageSize);
}

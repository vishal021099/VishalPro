package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity

public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cdi;
	private String name;
	
	@OneToMany( cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk", referencedColumnName = "cdi")
	private List<Product> product;

	public int getCdi() {
		return cdi;
	}

	public void setCdi(int cdi) {
		this.cdi = cdi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Category [cdi=" + cdi + ", name=" + name + ", product=" + product + "]";
	}

	
	
	
	
	
	
	
}

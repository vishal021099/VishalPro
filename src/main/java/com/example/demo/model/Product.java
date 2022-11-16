package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Product {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int di;
	private String name;
	@Override
	public String toString() {
		return "Product [di=" + di + ", name=" + name + ", price=" + price + "]";
	}
	public int getDi() {
		return di;
	}
	public void setDi(int di) {
		this.di = di;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;
	
	
}

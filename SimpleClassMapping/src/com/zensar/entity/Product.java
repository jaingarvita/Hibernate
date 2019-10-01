package com.zensar.entity;

/**
 * @author Garvita Jain
 * @creation_date 25th September 4.44PM
 * @modification_date 25th September 4.44PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is persistent class It represents database table PRODUCTS It
 *              is POJO Class.
 *             
 */


public class Product {
	private int productsid;
	private String name;
	private String brand;
	private Double price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productsid, String name, String brand, double price) {
		super();
		this.productsid = productsid;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public int getProductsid() {
		return productsid;
	}

	public void setProductsid(int productsid) {
		this.productsid = productsid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productsid=" + productsid + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
}

package com.javatechie.ProductDemo.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_table")

public class Product {  
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 
	 @Column(nullable = false, length = 45, unique = true)
	 private String name;
	 
	 @Column(nullable = false, length = 45, unique = true)
	 private int quantity;
	 
	 @Column(nullable = false, length = 45, unique = true)
	 private double price;
	
	 //Default Constructor
	 public Product() {
		 
	 } 
	 
	 //Constructor with Parameter 
	 public Product(int id, String name, int quantity, double price) {
			super();
			this.id = id;
			this.name = name;
			this.quantity = quantity;
			this.price = price;
		}
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	 
	 
}

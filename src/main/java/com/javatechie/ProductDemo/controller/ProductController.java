package com.javatechie.ProductDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.ProductDemo.Entity.Product;
import com.javatechie.ProductDemo.Service.ProductService;


@RestController
@RequestMapping("/v1/s1")
public class ProductController {
   
	@Autowired
	private ProductService service;
	
	
	@PostMapping("/saveproduct")
	public Product saveProduct(@RequestBody Product product) {
		
		
		return service.saveProduct(product);
		
	}
	
	@PostMapping("/saveproducts")
	public List<Product> saveProducts( @RequestBody List<Product> products) {
		
		return service.saveProducts(products);
	}
	
	@GetMapping("/getListProduct")
	public List<Product> findAllProducts(){
		
		return service.getProducts();
	}
	
	@GetMapping("/getProductById/{id}") //@PathVariable/@RequestParam
	public Product findProductById(@PathVariable int id) {
		
		return service.getProductById(id);
	}
	
	/*
	 * @GetMapping("/getProductByName/{name}") public Product
	 * findProductByName(@PathVariable String name) {
	 * 
	 * return service.getProductByName(name); }
	 */
	
	@DeleteMapping("/delete/{id}")
	public String ProductDeleteById(@PathVariable int id) {
		   		
		return service.deleteById(id);
		
	}
	
	public Product updateProduct(@RequestBody Product product) {
		
		return service.updateProduct(product);
	}
}











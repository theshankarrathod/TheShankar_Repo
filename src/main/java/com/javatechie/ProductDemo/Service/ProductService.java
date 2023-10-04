package com.javatechie.ProductDemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.ProductDemo.Entity.Product;
import com.javatechie.ProductDemo.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;


	
	
	// to save a one product
	public Product saveProduct(Product product) {

		return repository.save(product);

	}

	// to save a more than one products
	public List<Product> saveProducts(List<Product> products) {

		return repository.saveAll(products);

	}

	public List<Product> getProducts() {

		return repository.findAll();
	}

	public Product getProductById(int id) {

		return repository.getById(id);

	}

	/*
	 * public Product getProductByName(String name) {
	 * 
	 * return repository.getByname(name);
	 * 
	 * }
	 */

	public String deleteById(int id) {

		repository.deleteById(id);
		return "Removed from DB" + id;

	}

	
	public Product updateProduct(Product product) {

		// Product existingProduct=repo.findById(product.getId());
		Product existingProduct = repository.findById(product.getId()).orElse(null);

		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity());
		return repository.save(existingProduct);

	}

	/*
	 * public Product updateProduct1(Product product) {
	 * 
	 * Product existprod1 = repo.findById(product.getId()).orElse(null);
	 * 
	 * existprod1.setName(product.getName());
	 * existprod1.setPrice(product.getPrice());
	 * existprod1.setQuantity(product.getId()); return repo.save(existprod1);
	 * 
	 * }
	 * 
	 * public Product updateProduct2(Product product) {
	 * 
	 * Product existProd2 = repo.findById(product.getId()).orElse(null);
	 * existProd2.setName(product.getName());
	 * existProd2.setPrice(product.getPrice());
	 * existProd2.setQuantity(product.getQuantity());
	 * 
	 * return repo.save(existProd2); }
	 * 
	 * public Product updadateProduct3(Product product) {
	 * 
	 * Product existprod3 = repo.findById(product.getId()).orElse(null);
	 * existprod3.setName(product.getName());
	 * existprod3.setPrice(product.getPrice());
	 * existprod3.setQuantity(product.getQuantity());
	 * 
	 * return repo.save(existprod3); }
	 * 
	 * public Product updateProduct4(Product product) {
	 * 
	 * Product existProd4=repo.findById(product.getId()).orElse(null);
	 * existProd4.setName(product.getName());
	 * existProd4.setPrice(product.getPrice());
	 * existProd4.setQuantity(product.getQuantity());
	 * 
	 * return repo.save(existProd4);
	 * 
	 * }
	 */
	
}










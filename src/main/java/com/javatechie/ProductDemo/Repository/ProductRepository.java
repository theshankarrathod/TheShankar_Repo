package com.javatechie.ProductDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javatechie.ProductDemo.Entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>  {

}

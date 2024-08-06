package com.example.product_springboot_mysql.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.product_springboot_mysql.model.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}

package com.mouritech.springboot_hibernate_demo.service;


import java.util.List;

import com.mouritech.springboot_hibernate_demo.entity.Product;
import com.mouritech.springboot_hibernate_demo.exception.ProductNotFoundException;


public interface ProductService {

	Product insertProduct(Product newProduct);

	Product showProductById(String productId) throws ProductNotFoundException;

	List<Product> showAllProducts();



	Product updateProductById(String productId, Product product) throws ProductNotFoundException;

	void deleteProductById(String productId) throws ProductNotFoundException;

}
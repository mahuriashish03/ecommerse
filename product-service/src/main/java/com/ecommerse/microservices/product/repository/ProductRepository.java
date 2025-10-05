package com.ecommerse.microservices.product.repository;

import com.ecommerse.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {


}

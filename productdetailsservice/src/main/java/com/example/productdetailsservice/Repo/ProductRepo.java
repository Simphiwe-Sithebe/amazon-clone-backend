package main.java.com.example.productdetailsservice.Repo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.UUID;

import main.java.com.example.productdetailsservice.Entity.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, BigInteger>{

    Product save(Product product);
    ArrayList<Product> findAll();
    Product findByproductID(UUID productId);
    
} 
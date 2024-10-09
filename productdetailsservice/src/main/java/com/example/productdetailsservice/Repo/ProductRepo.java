package main.java.com.example.productdetailsservice.Repo;

import java.util.ArrayList;

@Repository
public interface ProductRepo extends MongoRepository<Product, BigInteger>{

    Product save(Product product);
    ArrayList<Product> findAll();
    Product findAllByproductID(UUID productId);
    
} 
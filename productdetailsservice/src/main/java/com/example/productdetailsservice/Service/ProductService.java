package main.java.com.example.productdetailsservice.Service;

import java.util.ArrayList;
import java.util.UUID;

import main.java.com.example.productdetailsservice.Entity.Product;
import main.java.com.example.productdetailsservice.Repo.ProductRepo;

@Service
public class ProductService {

        @Autowired
        ProductRepo productRepo;

        public Product saveDataToDB(Product product){
            return productRepo.saveDataToDB(product);
        }

        public ArrayList<Product> findAllProducts(){
            return productRepo.findAll();
        }

        public Product getProductDetails(UUID productId){
            return productRepo.findAllByproductID(productId);
        }
}

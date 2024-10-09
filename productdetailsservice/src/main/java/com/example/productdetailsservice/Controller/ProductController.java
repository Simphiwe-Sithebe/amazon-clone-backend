package main.java.com.example.productdetailsservice.Controller;

import java.util.ArrayList;

@RestController
@RequestMapping("/amazon/products")
public class ProductController {
    
    @PostMapping("/save")
    public Product saveData(@RequestBody Product product){

    }

    @GetMapping("/getAllProducts")
    public ArrayList<Product> getAllProducts(){
        
    }
    @GetMapping("/search/{productId}")
    public Product search(@PathVariable UUID productId){
        
    }
}

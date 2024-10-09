package main.java.com.example.productdetailsservice.Controller;

import java.util.ArrayList;

import main.java.com.example.productdetailsservice.Service.ProductService;

@RestController
@RequestMapping("/amazon/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/save")
    public Product saveData(@RequestBody Product product){
        return productService.saveDataToDB(product);
    }

    @GetMapping("/getAllProducts")
    public ArrayList<Product> getAllProducts(){
        return productService.findAll();
    }
    
    @GetMapping("/search/{productId}")
    public Product search(@PathVariable UUID productId){
        return productService.findAllByuniqueId(productId);
    }
}

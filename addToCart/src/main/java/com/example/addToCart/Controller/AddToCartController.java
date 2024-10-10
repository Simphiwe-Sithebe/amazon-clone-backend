package main.java.com.example.addToCart.Controller;


import org.springframework.web.bind.annotation.RequestMapping;

import main.java.com.example.addToCart.Service.AddToCartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import main.java.com.example.addToCart.Service.AddToCartService;
import main.java.com.example.addToCart.Model.Cart;

import java.util.UUID;

@RestController
@RequestMapping("/amazon/addToCart")
public class AddToCartController {

    @Autowired 
    AddToCartService addToCartService;
     
    @PostMapping("/add")
    public void addToCart(@RequestBody Cart cart) {
        addToCartService.addToCart(cart);
    }

    @DeleteMapping("/remove")
    public void removeFromCart(@RequestBody Cart cart) {
        addToCartService.removeFromCart(cart);
    }
    @GetMapping("/show/{userId}")
    public void showItems(@PathVariable UUID userId){
        addToCartService.displayAllProductsInCart(userId);
    }
}

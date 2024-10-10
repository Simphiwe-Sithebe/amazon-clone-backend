package main.java.com.example.addToCart.Service;

import java.util.ArrayList;
import java.util.UUID;

import main.java.com.example.addToCart.Repo.AddToCartRepo;

@Service
public class AddToCartService {

    @Autowired
    AddToCartRepo addToCartRepo;

    public void addToCart(Cart cart) {
        addToCartRepo.save(cart);
    }

    public void removeFromCart(Cart cart) {
        addToCartRepo.delete(cart);
    }

    public ArrayList<Cart> displayAllProductsInCart(UUID userId){
        addToCartRepo.findAllByUserId(userId);
    }
}

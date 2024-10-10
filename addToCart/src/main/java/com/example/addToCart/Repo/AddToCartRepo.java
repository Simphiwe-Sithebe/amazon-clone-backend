package main.java.com.example.addToCart.Repo;

import java.util.UUID;
@Repository
public interface AddToCartRepo extends CrudRepository<Cart, Long>{
     Cart save(Cart cart);
     void delete(Cart cart);
     ArrayList<Cart> findAllByUserId(UUID userId);

}

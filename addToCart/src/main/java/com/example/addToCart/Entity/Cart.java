package main.java.com.example.addToCart.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

 
@Entity
public class Cart {
    @Getter @Setter

    @Id
    @GeneratedValue
    private Long id;

    public UUID userId;
    public UUID productId;

    
    public Cart() {
    }
    public Cart(Long id, UUID userId, UUID productId) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public UUID getUserId() {
        return userId;
    }
    public void setUserId(UUID userId) {
        this.userId = userId;
    }
    public UUID getProductId() {
        return productId;
    }
    public void setProductId(UUID productId) {
        this.productId = productId;
    } 

}

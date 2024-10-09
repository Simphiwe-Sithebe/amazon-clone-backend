package main.java.com.example.productdetailsservice.Entity;

import java.math.BigInteger;
import java.util.UUID;

import javax.xml.bind.annotation.XmlID;

public class Product {

    //Mongo db only supports 3 data types, big int, string and object type
    @ID
    @GeneratedValue
    public BigInteger id;

    public UUID productID;
    public String name;
    public double price;
    public double rating;
    public String imageUrl;

    
}

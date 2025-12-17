package oop.assignmentQ03;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    public Cart(){
        products = new ArrayList<>();
    }

    public void addProductToCart(Product p){
        products.add(p);
    }

    public void calculateCartPrice(){
        float totalAmt = 0;
        for (Product p: products){
            totalAmt+= (p.getPrice() - p.calculateDiscount());
        }
        System.out.println("Your total cart amount is: "+ totalAmt);
    }
}

package oop.assignmentQ03;

import oop.assignmentQ02.ContractEmployee;
import oop.assignmentQ02.Employee;
import oop.assignmentQ02.PermanentEmployee;

public class OOPAAssignmentQ03 {
//    TODO: Q3: Online Shopping Cart System
//    Design a shopping cart module:
//        Abstract class Product
//            Fields: productId, name, price
//            Abstract method calculateDiscount()
//        Subclasses:
//            Electronics
//            Clothing
//            Grocery
//        Each product type has different discount rules
//        Create methods to:
//            Add product to cart
//            Calculate final cart price

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product laptop = new Electronics(1,"Macbook M4", 100000); //75000
        Product shirt = new Clothing(2, "US Polo Shirt", 3000); //2700
        Product wheat = new Grocery(3, "Wheat", 700); //560
//75560
// 2700
//78260
        laptop.getProductDetails();
        System.out.println(laptop.getPrice());
        System.out.println(laptop.calculateDiscount());
        shirt.getProductDetails();
        System.out.println(shirt.getPrice());
        System.out.println(shirt.calculateDiscount());
        wheat.getProductDetails();
        System.out.println(wheat.getPrice());
        System.out.println(wheat.calculateDiscount());

        cart.addProductToCart(laptop);
        cart.addProductToCart(shirt);
        cart.addProductToCart(wheat);

        cart.calculateCartPrice();
    }
}

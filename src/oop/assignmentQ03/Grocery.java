package oop.assignmentQ03;

public class Grocery extends Product{


    public Grocery(int productId, String name, int price) {
        super(productId, name, price);
    }


    @Override
    float calculateDiscount() {
        return getPrice() * (0.8f);
    }
}

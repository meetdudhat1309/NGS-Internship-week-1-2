package oop.assignmentQ03;

public class Clothing extends Product{

    public Clothing(int productId, String name, int price) {
        super(productId, name, price);
    }

    @Override
    float calculateDiscount() {
        return getPrice()*(0.9f);
    }
}

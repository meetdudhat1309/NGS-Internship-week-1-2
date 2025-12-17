package oop.assignmentQ03;

public class Electronics extends Product {


    public Electronics(int productId, String name, int price) {
        super(productId, name, price);
    }

    @Override
    float calculateDiscount() {
        return getPrice() * (0.75f);
    }
}

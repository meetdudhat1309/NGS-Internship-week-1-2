package oop.assignmentQ03;

abstract class Product {
    private final int productId;
    private String name;
    private float price;


    public Product(int productId, String name, int price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    abstract float calculateDiscount();

    public void getProductDetails(){
        System.out.println("Product Id: "+productId);
        System.out.println("Product name: "+name);
        System.out.println("Product price: "+price);
    }
}

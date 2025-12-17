package exception.exQ04;

public class Product {
    private String name;
    private int quantity;
    private boolean isAvailable;
    private PaymentStatus paymentStatus;

    public Product(String name, int quantity, boolean isAvailable, PaymentStatus paymentStatus) {
        this.name = name;
        this.quantity = quantity;
        this.isAvailable = isAvailable;
        this.paymentStatus = paymentStatus;
    }

    public void submitDetails() throws ProductNotAvailableException, PaymentErrorOrPendingException, OutOfStockItemException {
        if (!isAvailable) throw new ProductNotAvailableException("Product not available!");
        if (paymentStatus != PaymentStatus.COMPLETED) throw new PaymentErrorOrPendingException("Some issue with payment!");
        if (quantity<0) throw new OutOfStockItemException("Item out of stock!");
    }

}

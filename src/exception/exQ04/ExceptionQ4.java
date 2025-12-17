package exception.exQ04;

import exception.exQ03.FileModel;
import exception.exQ03.FileSizeLimitExceedException;
import exception.exQ03.FileType;
import exception.exQ03.InvalidFileFormat;

import java.util.Scanner;

public class ExceptionQ4 {
//    Q1: Design an order placement module for an e-commerce application.
//    Throw different exceptions for:
//    Product availability.
//    Out-of-stock items.
//    Payment failure.

    public static void main(String[] args)  {
        Product p = new Product("Laptop", 2, true, PaymentStatus.COMPLETED);

        try {
            p.submitDetails();
        } catch (ProductNotAvailableException | PaymentErrorOrPendingException | OutOfStockItemException e) {
            throw new RuntimeException(e);
        }
    }
}


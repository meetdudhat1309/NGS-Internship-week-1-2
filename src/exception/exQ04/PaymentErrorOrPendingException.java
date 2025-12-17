package exception.exQ04;

public class PaymentErrorOrPendingException extends Exception{
    public PaymentErrorOrPendingException(String message) {
        super(message);
    }
}

package udemy.users;

public class PaymentMethod {
    private String paymentName;
    private String paymentType;

    public PaymentMethod(String paymentName, String paymentType) {
        this.paymentName = paymentName;
        this.paymentType = paymentType;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}

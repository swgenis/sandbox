package sample.model.payments;

public class PaymentInitiation {

    private String id;

    private Object creditTransferInitiation;

    private Object paymentStatusReport;

    public PaymentInitiation() {
        super();
    }

    public PaymentInitiation(String id, Object creditTransferInitiation) {
        this.id = id;
        this.creditTransferInitiation = creditTransferInitiation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getCreditTransferInitiation() {
        return creditTransferInitiation;
    }

    public void setCreditTransferInitiation(Object creditTransferInitiation) {
        this.creditTransferInitiation = creditTransferInitiation;
    }

    public Object getPaymentStatusReport() {
        return paymentStatusReport;
    }

    public void setPaymentStatusReport(Object paymentStatusReport) {
        this.paymentStatusReport = paymentStatusReport;
    }

}

package LowLevelDesign.ParkingLot.model.payment;

public class PayByUPI extends CashlessPayment{

    public PayByUPI() {
        super(PaymentCategory.UPI);
    }
}

package LowLevelDesign.ParkingLot.model.payment;

public class PayByCash extends Payment{

    public PayByCash() {
        super(PaymentCategory.CASH);
    }
}

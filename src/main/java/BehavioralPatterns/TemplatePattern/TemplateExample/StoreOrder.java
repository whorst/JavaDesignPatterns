package BehavioralPatterns.TemplatePattern.TemplateExample;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Ring up items,");
    }

    @Override
    public void doPayment() {
        System.out.println("Ring up items from cart");
    }

    @Override
    public void doDelivery() {
        System.out.println("Bag items at counter");
    }

    @Override
    public void doReceipt() {
        System.out.println("Print receipt");
    }

}

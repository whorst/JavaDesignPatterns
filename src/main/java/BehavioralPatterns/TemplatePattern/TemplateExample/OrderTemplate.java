package BehavioralPatterns.TemplatePattern.TemplateExample;

public abstract class OrderTemplate {

    public boolean isGift;
    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doReceipt();
    public abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift was wrapped");
    }

    public final void processOrder() {
        //This is the template/algorithm being talked about. As long as the concretes have these methods,
        //the implementation logic doesn't enf up mattering.
        doCheckout();
        doPayment();
        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }
        doDelivery();
    }
}

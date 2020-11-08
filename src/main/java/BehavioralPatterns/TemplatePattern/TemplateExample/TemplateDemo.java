package BehavioralPatterns.TemplatePattern.TemplateExample;

public class TemplateDemo {

    public static void main(String[] args) {
        System.out.println("Web Order");

        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }

}

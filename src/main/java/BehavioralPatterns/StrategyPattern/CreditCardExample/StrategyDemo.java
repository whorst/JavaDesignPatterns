package BehavioralPatterns.StrategyPattern.CreditCardExample;

public class StrategyDemo {

    public static void main(String args[]) {
         CreditCard amexCard = new CreditCard(new AmexxStrategy());

         amexCard.setNumber("379185883464283");
         amexCard.setDate("04/2020");
         amexCard.setCvv("123");

         System.out.println("IS Amex Valid: " + amexCard.isValid());

         CreditCard amexCard2 = new CreditCard(new AmexxStrategy());

         amexCard2.setNumber("379185883464282");
         amexCard2.setDate("04/2017");
         amexCard2.setCvv("123");

         System.out.println("IS Amex Valid: " + amexCard2.isValid());

         CreditCard visaCard = new CreditCard(new VisaStrategy());

         visaCard.setNumber("4539589763663402");
         visaCard.setDate("04/2020");
         visaCard.setCvv("123");

         System.out.println("IS visa Valid: " + visaCard.isValid());
    }
}

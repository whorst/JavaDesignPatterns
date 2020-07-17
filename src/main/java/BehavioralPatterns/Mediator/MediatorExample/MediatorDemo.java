package BehavioralPatterns.Mediator.MediatorExample;

public class MediatorDemo {
    public static void exampleTwo() {

        /*
        *
        * */

        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();
    }
}

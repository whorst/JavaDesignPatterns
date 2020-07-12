package BehavioralPatterns.Command.MacroExample;


import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static void exampleFour(){
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        //In this example, the light.on method is never called by the requester directly.
        // Instead the interface for toggling a given light is
        Command toggleCommand = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);

        //This is to shut off all lights in the house at once
        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);
        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
    }
}

package BehavioralPatterns.Command.StateExample;


public class CommandDemo {
    public static void exampleThree(){
        Light light = new Light();
        Switch lightSwitch = new Switch();

        //In this example, the light.on method is never called by the requester directly.
        // Instead the interface for toggling a given light is
        Command toggleCommand = new ToggleCommand(light);

        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
    }
}

package BehavioralPatterns.Command.SwitchExample;


public class CommandDemo {
    public static void exampleTwo(){
        Light light = new Light();
        Switch lightSwitch = new Switch();

        Command onCommand = new OnCommand(light);

        lightSwitch.storeAndExecute(onCommand);
    }
}

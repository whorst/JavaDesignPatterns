package BehavioralPatterns.Command.MacroExample;

//This entire class is kind of the meat of the command Design pattern. It's purpose is provide an interface c for a sender,
// as opposed to the sender having to play with the receiver

//concrete command
public class OnCommand implements Command {
    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //the client doesnt directly call light.on(), instead we have this concrete command class handle it
        light.on();
    }
}

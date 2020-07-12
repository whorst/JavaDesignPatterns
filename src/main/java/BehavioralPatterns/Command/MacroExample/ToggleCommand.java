package BehavioralPatterns.Command.MacroExample;

public class ToggleCommand implements Command {
    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute()
    {
        //The light object now holds the state
        light.toggle();
    }
}

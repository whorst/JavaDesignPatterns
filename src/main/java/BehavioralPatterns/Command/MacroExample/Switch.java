package BehavioralPatterns.Command.MacroExample;

//invoker/sender
public class Switch {

    public void storeAndExecute(Command command){
        command.execute();
    }

}

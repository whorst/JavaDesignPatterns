package BehavioralPatterns.Command.SwitchExample;

//invoker/sender
public class Switch {

    public void storeAndExecute(Command command){
        command.execute();
    }

}

package BehavioralPatterns.Command.StateExample;

//invoker/sender
public class Switch {

    public void storeAndExecute(Command command){
        command.execute();
    }

}

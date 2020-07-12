package BehavioralPatterns.Command.SwitchExample;

//receiver
public class Light {

    public void on(){
        System.out.println("Light switched on");
    }

    public void off(){
        System.out.println("Light switched off");
    }

}

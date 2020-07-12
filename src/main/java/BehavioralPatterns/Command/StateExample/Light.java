package BehavioralPatterns.Command.StateExample;

//receiver
public class Light {

    //This is the state porion of it
    private boolean isOn = false;

    public void toggle(){
        if(isOn) {
            off();
            isOn = false;
        }else{
            on();
            isOn = true;
        }
    }

    public void on(){
        System.out.println("Light switched on");
    }

    public void off(){
        System.out.println("Light switched off");
    }

}

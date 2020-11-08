package BehavioralPatterns.StatePattern.IfElseExample;

public class Fan {
    final static int OFF = 0;
    final static int ON = 1;

    int state = OFF;

    public void pullChain(){
        if(state == OFF){
            state = ON;
        }
        else if(state == ON) {
            state = OFF;
        }
    }

    @Override
    public String toString() {
        return "Fan is " + state;
    }
}

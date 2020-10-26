package BehavioralPatterns.ObserverPattern.ObserverEverydayExample;

import java.util.Observable;

public class TwitterStream extends Observable {

    public void someoneTweeted() {
        setChanged(); //SetChanged signifies to the observer that we changed our state so notify observers gets fired
        notifyObservers();
    }
}

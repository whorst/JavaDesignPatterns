package BehavioralPatterns.ObserverPattern.AdvancedObserverDemo;

public class ObserverTabletClient extends Observer {
    public ObserverTabletClient(Subject subject) {
        this.subjet = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subjet.setState(message+"- sent from tablet");
    }

    @Override
    void update() {
        System.out.println("Tablet Stream: "+ subjet.getState());
    }
}

package BehavioralPatterns.ObserverPattern.AdvancedObserverDemo;

public class ObserverPhoneClient extends Observer {

    public ObserverPhoneClient(Subject subject) {
        this.subjet = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subjet.setState(message + " - sent from phone");
    }

    @Override
    void update() {
        System.out.println("Phone Stream: " + subjet.getState());
    }
}

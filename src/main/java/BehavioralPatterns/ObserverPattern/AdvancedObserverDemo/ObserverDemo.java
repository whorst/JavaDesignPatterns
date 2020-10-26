package BehavioralPatterns.ObserverPattern.AdvancedObserverDemo;

public class ObserverDemo {
    public static void main(String args[]){
        Subject subject = new SubjectMessageStream();

        ObserverPhoneClient phoneClient = new ObserverPhoneClient(subject);
        ObserverTabletClient tabletClient = new ObserverTabletClient(subject);

        phoneClient.addMessage("Here is a new message");
        tabletClient.addMessage("Another new message");
    }
}

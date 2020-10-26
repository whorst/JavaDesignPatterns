package BehavioralPatterns.ObserverPattern.ObserverEverydayExample;

public class ObserverEverydayDemo {

    public static void main(String args[]) {
        TwitterStream messageStream = new TwitterStream();

        Client client1 = new Client("Bryan");
        Client client2 = new Client("Mark");

        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someoneTweeted();
    }
}

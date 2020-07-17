package BehavioralPatterns.Mediator;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {

    /*
    * Implement a timer object to schedule some tasks. The mediator is the timer in the scheduling method/
    * The mediator does not require objects to communicate directly
    * */

    private Timer timer;

    public static void exampleOne(int seconds) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Timer timer = new Timer();
        timer.schedule(new RemindTask(), seconds* 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
    }

    static class RemindTask extends TimerTask {
        public void run () {
            System.out.println("Times up!");
//            toolkit.beep();
        }
    }


    static class RemindTaskWithoutBeep extends TimerTask {
        public void run () {
            System.out.println("Now time's really up!");
//            timer.cancel();
        }
    }
}



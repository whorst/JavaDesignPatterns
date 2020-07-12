package BehavioralPatterns.Command;

public class RunnableExample {
    public static void exampleOne() {
        Task task1 = new Task(10, 12); //encapsulates request
        Task task2 = new Task(10, 12);

        Thread thread1 = new Thread(task1);
        thread1.start(); //invoker

        Thread thread2 = new Thread(task2);
        thread2.start();
    }

    static class Task implements Runnable {
        int num1;
        int num2;

        Task(int num1, int num2){
            this.num1 = num1;
            this.num2 = num2;
        }

        @Override
        public void run() {  //execute method
            System.out.println(num1 * num2);  //receiver
        }
    }
}

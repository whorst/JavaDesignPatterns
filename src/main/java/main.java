import BehavioralPatterns.ChainOfResponsibility.CeoExample.ChainOfResponsibilityDemo;
import BehavioralPatterns.ChainOfResponsibility.LoggingExample;
import BehavioralPatterns.Command.RunnableExample;
import BehavioralPatterns.Command.SwitchExample.CommandDemo;
import BehavioralPatterns.Interpreter.InterpreterExample.InterpreterDemo;
import BehavioralPatterns.Interpreter.PatternExample;
import BehavioralPatterns.Iterator.IteratorDemo;
import BehavioralPatterns.Mediator.TimerExample;
import CreationPatterns.Builder.CorrectLunchOrderBuilder;
import CreationPatterns.Factory.Pages.Website;
import CreationPatterns.Factory.Pages.WebsiteFactory;
import CreationPatterns.Prototype.BookRegistry.Registry;
import CreationPatterns.Singleton.DBSingleton;

import static BehavioralPatterns.Command.MacroExample.CommandDemo.exampleFour;

public class main {
    public static void main(String[] args) throws Exception {

//Behavioral
        Mediator();
//        Iterator();
//        Interpreter();
//        Command();
//        ChainOfResponsibility();

//Creational
//        Factory();
//        Singleton();
//        Builder();
//        Prototype();
    }

    public static void Mediator() {
        //Difference between mediator and command pattern
        //https://softwareengineering.stackexchange.com/questions/364139/what-is-the-difference-between-the-command-and-mediator-patterns#:~:text=Is%20it%20the%20right%20question,Player%20or%20by%20a%20mediator).
        TimerExample.exampleOne(1);
    }

    public static void Iterator() {
        IteratorDemo.exampleOne();
    }

    public static void Interpreter() {
//        InterpreterDemo.ExampleTwo();
//        PatternExample.ExampleOne();
    }

    public static void Command() {
        //Difference between mediator and command pattern
        //https://softwareengineering.stackexchange.com/questions/364139/what-is-the-difference-between-the-command-and-mediator-patterns#:~:text=Is%20it%20the%20right%20question,Player%20or%20by%20a%20mediator).
        exampleFour();
        BehavioralPatterns.Command.StateExample.CommandDemo.exampleThree();
//        CommandDemo.exampleTwo();
//        RunnableExample.exampleOne();
    }

    public static void ChainOfResponsibility() {
        LoggingExample.firstExample();
        ChainOfResponsibilityDemo.exampleTwo();
    }

    public static void Factory() {
//        CalendarExample.calendarExample();
        Website site = WebsiteFactory.getWebsite("blog");
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite("shop");
        System.out.println(site.getPages());
    }

    public static void Prototype() {
//        Statement.firstExample();
        Registry.PrototypeDemo();
    }

    public static void Singleton() {
//        DBSingleton.firstExample();
        DBSingleton.secondExample();
    }

    public static void Builder() {
        CorrectLunchOrderBuilder.Builder lunchBuilder = new CorrectLunchOrderBuilder.Builder();
        lunchBuilder.condiment("Mayo").bread("Wheat").meat("Beef").dressing("Salad");
        CorrectLunchOrderBuilder lunchOrder = lunchBuilder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiment());
        System.out.println(lunchOrder.getMeat());
        System.out.println(lunchOrder.getDressing());
    }
}

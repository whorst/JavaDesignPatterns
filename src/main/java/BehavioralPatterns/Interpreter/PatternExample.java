package BehavioralPatterns.Interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    public static void ExampleOne(){
        String input = "Lions, and tigers, and bears! oh, my!"; //Create a sentence and establish a grammar

        Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger|Lion)");

        Matcher m = p.matcher(input);
        while (m.find()){
            System.out.println("Found a " + m.group() + "."); //interpret the sentence and display what we parsed using a pattern
        }
    }
}

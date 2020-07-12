package BehavioralPatterns.Interpreter.InterpreterExample;

public class InterpreterDemo {
//this is essentially doing string searching


    static Expression buildInterpreterTree() {
//        Expression terminal1 = null;
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal3 = new TerminalExpression("Tigers");
        Expression terminal2 = new TerminalExpression("Bears");

        //Tigers and Bears
        Expression alteration1 = new AndExpression(terminal2, terminal3);

        //Lions or (Tigers and Bears)
        Expression alteration2 = new OrExpression(terminal1, alteration1);

        return new AndExpression(terminal3, alteration2);
    }

    public static void ExampleTwo() {
        String context = "Tigers Bears";

        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));
    }
}

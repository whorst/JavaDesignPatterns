package BehavioralPatterns.ChainOfResponsibility.CeoExample;

import jdk.nashorn.internal.ir.RuntimeNode;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);

}

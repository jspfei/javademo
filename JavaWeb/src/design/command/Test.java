package design.command;

import design.command.model.Command;
import design.command.model.Invoker;
import design.command.model.MyCommand;
import design.command.model.Receiver;

/**
 * Created by admin on 2017/5/3.
 */
public class Test {

    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}

package design.command.model;

/**
 * Created by admin on 2017/5/3.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}

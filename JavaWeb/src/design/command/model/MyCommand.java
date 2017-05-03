package design.command.model;

/**
 * Created by admin on 2017/5/3.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}

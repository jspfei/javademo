package design.mediator;

/**
 * Created by admin on 2017/5/3.
 */
public class User1 extends User {
    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        int fand = getMediator().getBall().getFand();
        getMediator().getBall().setFand(fand+10);
        System.out.println("user1 exe!"+getMediator().getBall().getFand());
    }
}

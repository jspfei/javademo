package design.mediator;

/**
 * Created by admin on 2017/5/3.
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {

        int fand = getMediator().getBall().getFand();
        getMediator().getBall().setFand(fand+20);
        System.out.println("user2 exe!"+getMediator().getBall().getFand());
    }
}

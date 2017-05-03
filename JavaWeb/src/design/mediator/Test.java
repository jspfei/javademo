package design.mediator;

/**
 * Created by admin on 2017/5/3.
 */
public class Test {

    public static void main(String[] args){
        Ball ball = new Ball();
        Mediator mediator = new MyMediator(ball);
        mediator.createMediator();
        mediator.workAll();
    }
}

package design.observer.model;

/**
 * Created by admin on 2017/5/3.
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}

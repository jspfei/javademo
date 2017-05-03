package design.observer;

import design.observer.model.MySubject;
import design.observer.model.Observer1;
import design.observer.model.Observer2;
import design.observer.model.Subject;

/**
 * Created by admin on 2017/5/3.
 */
public class ObserverTest {
    public static void main(String[] args){
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}

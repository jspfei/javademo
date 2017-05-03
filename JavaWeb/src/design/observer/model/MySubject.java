package design.observer.model;

/**
 * Created by admin on 2017/5/3.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation(){
        System.out.println("update self!");
        notifyObservers();
    }
}

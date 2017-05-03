package design.observer.model;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by admin on 2017/5/3.
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<Observer>();
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            enumeration.nextElement().update();
        }
    }

}

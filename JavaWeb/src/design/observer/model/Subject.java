package design.observer.model;

import design.observer.model.Observer;

/**
 * Created by admin on 2017/5/3.
 */
public interface Subject {
    public void add(Observer observer);

    public void del(Observer observer);

    public void notifyObservers();

    public void operation();
}

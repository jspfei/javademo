package design.iterator.model;

/**
 * Created by admin on 2017/5/3.
 */
public interface Iterator {

    public Object previous();
    public Object next();
    public boolean hasNext();
    public Object first();
}

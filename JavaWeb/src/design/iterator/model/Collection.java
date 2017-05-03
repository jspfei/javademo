package design.iterator.model;

/**
 * Created by admin on 2017/5/3.
 */
public interface Collection {
    public Iterator iterator();
    public Object get(int i);
    public int size();
}

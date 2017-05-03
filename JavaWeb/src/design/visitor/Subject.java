package design.visitor;

/**
 * Created by admin on 2017/5/3.
 */
public interface Subject {
    public void accept(Vistor vistor);
    public String getSubject();
}

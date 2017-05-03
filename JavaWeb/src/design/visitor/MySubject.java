package design.visitor;

/**
 * Created by admin on 2017/5/3.
 */
public class MySubject implements Subject {
    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}

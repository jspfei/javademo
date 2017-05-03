package design.visitor;

/**
 * Created by admin on 2017/5/3.
 */
public class MyVisitor implements Vistor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject: "+sub.getSubject());
    }
}

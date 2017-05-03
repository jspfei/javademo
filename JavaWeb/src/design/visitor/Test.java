package design.visitor;

/**
 * Created by admin on 2017/5/3.
 */
public class Test {

    public static void main(String[] args){
        Vistor vistor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(vistor);
    }
}

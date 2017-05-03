package design.decorator.model;

/**
 * Created by admin on 2017/5/2.
 */
public class Decorator implements Sourceable {

    private Sourceable source;
    public Decorator(Sourceable source){
        this.source = source;
    }
    @Override
    public void method() {

        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}

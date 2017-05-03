package design.decorator.model;

/**
 * Created by admin on 2017/5/2.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("this source method !");
    }
}

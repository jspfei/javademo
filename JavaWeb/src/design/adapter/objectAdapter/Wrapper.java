package design.adapter.objectAdapter;

import design.adapter.model.Source;
import design.adapter.model.Targetable;

/**
 * Created by admin on 2017/5/2.
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}

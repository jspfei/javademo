package design.adapter.classAdapter;

import design.adapter.model.Source;
import design.adapter.model.Targetable;

/**
 * Created by admin on 2017/5/2.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}

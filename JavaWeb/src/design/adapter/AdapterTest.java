package design.adapter;

import design.adapter.classAdapter.Adapter;
import design.adapter.model.Source;
import design.adapter.model.Targetable;
import design.adapter.objectAdapter.Wrapper;

/**
 * Created by admin on 2017/5/2.
 */
public class AdapterTest {
    public static void main(String[] args){
      /*  Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();*/
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }
}

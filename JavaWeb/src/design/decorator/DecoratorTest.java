package design.decorator;

import design.decorator.model.Decorator;
import design.decorator.model.Source;
import design.decorator.model.Sourceable;

/**
 * Created by admin on 2017/5/2.
 */
public class DecoratorTest {
    public static void main(String[] args){
        Sourceable sourceable = new Source();
        Sourceable obj = new Decorator(sourceable);
        obj.method();
    }
}

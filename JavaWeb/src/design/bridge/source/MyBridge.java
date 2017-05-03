package design.bridge.source;

/**
 * Created by admin on 2017/5/3.
 */
public class MyBridge extends Bridge{

    public void method(){
        getSourceable().method();
    }
}

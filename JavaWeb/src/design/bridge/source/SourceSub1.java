package design.bridge.source;

/**
 * Created by admin on 2017/5/2.
 */
public class SourceSub1 implements Sourceable{
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}

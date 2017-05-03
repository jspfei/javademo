package design.adapter.interfaceAdapter;

/**
 * Created by admin on 2017/5/2.
 */
public class WrapperTest
{
    public static void main(String[] args){
        Sourceable sub1 = new SourceSub1();
        Sourceable sub2 = new SourceSub2();

        sub1.method1();
        sub1.method2();
        sub2.method1();
        sub2.method2();
    }
}

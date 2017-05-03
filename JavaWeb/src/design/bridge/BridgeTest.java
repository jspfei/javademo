package design.bridge;

import design.bridge.source.*;

/**
 * Created by admin on 2017/5/2.
 */
public class BridgeTest {

    public static void main(String[] args){
        Bridge bridge = new MyBridge();

        Sourceable sourceable1 = new SourceSub1();
        bridge.setSourceable(sourceable1);
        bridge.method();

        Sourceable sourceable2 = new SourceSub2();
        bridge.setSourceable(sourceable2);
        bridge.method();
    }
}

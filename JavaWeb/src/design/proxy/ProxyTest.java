package design.proxy;

import design.proxy.model.Proxy;
import design.proxy.model.Sourceable;

/**
 * Created by admin on 2017/5/2.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
    }

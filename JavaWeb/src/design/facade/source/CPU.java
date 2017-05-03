package design.facade.source;


import sun.rmi.runtime.Log;

/**
 * Created by admin on 2017/5/2.
 */
public class CPU {
    private static final String TAG = "CPU";
    public void startup(){
        System.out.println(TAG+" startup !");
    }

    public void shutdown(){
        System.out.println(TAG+ " shutdown!");
    }
}

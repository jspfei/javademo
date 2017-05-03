package design.facade.source;

/**
 * Created by admin on 2017/5/2.
 */
public class Memory {
    private static final String TAG = "Memory";

    public void startup(){
        System.out.println(TAG+" startup!");
    }

    public void shutdown(){
        System.out.println(TAG +" shutdown!");
    }
}

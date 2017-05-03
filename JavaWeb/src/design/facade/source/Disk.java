package design.facade.source;

/**
 * Created by admin on 2017/5/2.
 */
public class Disk {
    private static final String TAG = "Disk";

    public void startup(){
        System.out.println(TAG+" startup!");
    }

    public void shutdown(){
        System.out.println(TAG +" shutdown!");
    }
}

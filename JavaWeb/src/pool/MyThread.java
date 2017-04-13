package pool;

import java.io.File;

/**
 * Created by admin on 2017/4/13.
 */
public class MyThread extends Thread{
    private File mFile;
    public MyThread(File file){
        mFile = file;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"--------------------正在执行...");
        PrintDirectory.printDirectory(mFile);
        System.out.println(Thread.currentThread().getName()+"--------------------执行结束...");
    }
}
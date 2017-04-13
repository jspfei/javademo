package pool;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by admin on 2017/4/13.
 */

public class PoolTest {

    public static void main(String[] args) throws Exception{
        //nomarlJob();
        poolJob();
    }
    private static void nomarlJob(){
        PrintDirectory.printDirectory(new File("E:\\log"));
        PrintDirectory.printDirectory(new File("E:\\file"));
    }
    private static void poolJob(){
        // ExecutorService pool = Executors.newFixedThreadPool(3);//固定线程的线程池
         /*   从以上结果可以看出，newFixedThreadPool的参数指定了可以运行的线程的最大数目，
            超过这个数目的线程加进去以后，不会运行。其次，加入线程池的线程属于托管状态，
            线程的运行不受加入顺序的影响。当然使用newCachedThreadPool就不会出现这个问题。*/
        ExecutorService pool = Executors.newCachedThreadPool();//具有伸缩的线程池；
        MyThread t1 = new MyThread(new File("E:\\log"));
        MyThread t2 = new MyThread(new File("E:\\file"));
        pool.execute(t1);
        pool.execute(t2);
        pool.shutdown();

    }

}

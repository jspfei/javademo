package pool.threadmodel;

/**
 * 实现 Runnable 创建 线程
 * Created by admin on 2017/4/13.
 */
class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Running "+threadName);
        //线程处理事情
        try{
            for(int i = 4;i>0;i--){
                System.out.println("Thread: "+threadName+","+i);
                //让线程睡眠
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread "+threadName+" interrupted.");
        }

        System.out.println("Thread "+threadName+"exiting.");
    }

    public void start() {
        System.out.println("Starting "+threadName);
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}
public class TestRunnable {
    public static void main(String[] args){
        RunnableDemo r1 = new RunnableDemo("Thread-1");
        r1.start();

        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r2.start();
    }
}




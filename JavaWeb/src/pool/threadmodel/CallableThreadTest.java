package pool.threadmodel;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Created by admin on 2017/4/13.
 */
public class CallableThreadTest implements Callable<Integer> {
    public static void main(String[] args){
        CallableThreadTest ctt = new CallableThreadTest();
        Future<Integer> ft = new FutureTask<Integer>(ctt);
        for(int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" 的循环变量 i 的值"+i);
            if(i==20){
                new Thread((Runnable) ft,"有返回值的线程").start();
            }
        }
        try
        {
            System.out.println("子线程的返回值："+ft.get());
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        } catch (ExecutionException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public Integer call() throws Exception {

        int i = 0 ;
        for(;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return null;
    }
}

package pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by admin on 2017/4/13.
 */
public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        List<MyList> list = new ArrayList<MyList>();
        MyList myList = new MyList();
        list.add(myList);
        list.add(myList);
        List<Future<List<String>>> futureList = pool.invokeAll(list);
        System.out.println("---:"+futureList.size());
        for(int i=0;i<futureList.size();i++) {

            List<String>  listFuture = null;
            try {
                listFuture = futureList.get(i).get();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            for(int j=0;j<listFuture.size();j++){
                System.out.println("j  =  "+j+"  value   = "+ listFuture.get(j));
            }
            System.out.println("i  =  "+i+"  value   = "+ futureList.get(i));
        }
   }

}

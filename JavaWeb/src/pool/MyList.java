package pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by admin on 2017/4/13.
 */
public class MyList implements Callable<List<String>> {
    static  int i = 1;
    @Override
    public List<String> call() throws Exception {
        List list = new ArrayList();
        list.add("--------------1");
        list.add("--------------2");
        list.add("--------------3");
        System.out.println("-----i=:"+i++);
        return list;
    }
}

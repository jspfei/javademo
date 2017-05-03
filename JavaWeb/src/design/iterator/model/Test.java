package design.iterator.model;

/**
 * Created by admin on 2017/5/3.
 */
public class Test {
    public static void main(String[] args){
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

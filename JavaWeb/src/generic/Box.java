package generic;

/**
 * Created by admin on 2017/4/13.
 */
public class Box<T> {
    private T t;
    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args){
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("火在现场"));

        System.out.printf("整型值为： %d\n\n",integerBox.get());
        System.out.printf("字符串为： %s\n\n",stringBox.get());
    }
}
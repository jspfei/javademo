package generic;

/**
 * Created by admin on 2017/4/13.
 */
public class MaximumTest{

    //比较 三个值并返回最大值
    public static <T extends Comparable<T>> T maximun(T x,T y,T z){
        T max = x;
        if (y.compareTo(max)>0){
            max = y;
        }
        if (z.compareTo(max)>0){
            max = z;
        }
        return max;
    }
    public static void main(String args[]){
        System.out.printf("%d ,%d 和 %d 中最大的数为 %d \n\n ",3,4,5
        ,maximun(3,4,5));

        System.out.printf("%.1f ,%.1f 和 %.1f 中最大的数为 %.1f \n\n ",3.2,4.4,5.5
                ,maximun(3.2,4.4,5.5));

        System.out.printf("%s ,%s 和 %s 中最大的数为 %s\n\n ","pear","apple","orange"
                ,maximun("pear","apple","orange"));
    }
}

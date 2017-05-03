package design.template_method;

/**
 * Created by admin on 2017/5/3.
 */
public abstract class AbstractCalculator {
    public final int calculate(String exp,String opt){
        int array[] = split(exp,opt);
        return calculate(array[0],array[1]);
    }

    public abstract int calculate(int i, int i1);

    private int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int aryInt[] = new int[2];
        aryInt[0] = Integer.parseInt(array[0]);
        aryInt[1] = Integer.parseInt(array[1]);
        return aryInt;
    }
}

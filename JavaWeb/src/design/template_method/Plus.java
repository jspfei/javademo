package design.template_method;

/**
 * Created by admin on 2017/5/3.
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int i, int i1) {
        return i+i1;
    }
}

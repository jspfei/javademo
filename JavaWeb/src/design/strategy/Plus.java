package design.strategy;

/**
 * Created by admin on 2017/5/3.
 */
public class Plus extends AbstractCalculator implements ICalulator {
    @Override
    public int calculate(String exp) {

        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0] + arrayInt[1];
    }
}

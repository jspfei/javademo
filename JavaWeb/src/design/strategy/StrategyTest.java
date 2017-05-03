package design.strategy;

/**
 * Created by admin on 2017/5/3.
 */
public class StrategyTest {
    public static void main(String[] args){
        String exp = "2+8";
        ICalulator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}

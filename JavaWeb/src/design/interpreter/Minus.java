package design.interpreter;

/**
 * Created by admin on 2017/5/3.
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}

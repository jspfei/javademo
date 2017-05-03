package design.state;

/**
 * Created by admin on 2017/5/3.
 */
public class Test {

    public static void main(String[] args){
        State state = new State();

        Context context = new Context(state);

        state.setValue("state1");
        context.method();

        state.setValue("state2");
        context.method();
    }
}

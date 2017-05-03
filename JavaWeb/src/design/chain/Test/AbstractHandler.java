package design.chain.Test;

/**
 * Created by admin on 2017/5/3.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler(){
        return handler;
    }
    public void setHandler(Handler handler){
        this.handler = handler;
    }
}

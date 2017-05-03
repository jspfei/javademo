package design.bridge.source;

/**
 * Created by admin on 2017/5/3.
 */
public abstract class Bridge {
    private Sourceable sourceable;

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    public void method(){
        sourceable.method();
    }

}

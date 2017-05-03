package design.memento;

/**
 * Created by admin on 2017/5/3.
 */
public class Memento {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento(String value){
        this.value = value;
    }


}

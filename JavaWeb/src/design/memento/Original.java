package design.memento;

/**
 * Created by admin on 2017/5/3.
 */
public class Original {
    private String value;
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public Original(String value){
        this.value = value;
    }

    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }

}

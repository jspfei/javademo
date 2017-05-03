package design.chain.Test;

/**
 * Created by admin on 2017/5/3.
 */
public class MyHandler extends AbstractHandler implements Handler {
   private String name;

   public MyHandler(String name){
       this.name = name;
   }

    @Override
    public void operator() {
        System.out.println(name +"deal!");

        if(getHandler()!=null){
            getHandler().operator();
        }
    }
}

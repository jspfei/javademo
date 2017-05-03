package design.template_method;

/**
 * Created by admin on 2017/5/3.
 */
public class TemplateTest {
    public static void main(String[] args){
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp,"\\+");
        System.out.println(result);
    }
}

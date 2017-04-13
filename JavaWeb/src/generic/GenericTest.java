package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/4/13.
 */
public class GenericTest {
    public static void main(String args[]){
        List<Object> name = new ArrayList<Object>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(212);

    //    getUperNumber(name);
        getUperNumber(age);
        getUperNumber(number);

    }
    public static void getData(List<?> data){
        System.out.println("data: "+data.get(0));
    }

    public static void getUperNumber(List<? extends Number> data){
        System.out.println("data: "+data.get(0));
    }
}

package array;

/**
 * Created by admin on 2017/4/18.
 */
public class TestArray {
    public static void main(String[] args){
        int size =4;
        double[] myList = new double[size];
        myList[0] = 1.2;
        myList[1] = 3.2;
        myList[2] = 4.5;
        myList[3] = 8.6;

        double total = 0;
        for(int i = 0;i< size;i++){
            total += myList[i];
        }
        System.out.println("all  "+total);

        for(double element:myList){
            System.out.println(element);
        }


    }
}

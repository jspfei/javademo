package generic;

/**
 * Created by admin on 2017/4/13.
 */
public class GenericMethodTest {
    //泛型方法 printArray
    public static < E > void printArray(E [] inputArray){
        //输出数组元素
        for(E element: inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static void main(String args[]){
        //创建不同类型数组：Integer ,Double 和 Char
        Integer[] intArray = {1,2,4,5,6};
        Double[] doubleArray = {1.1,2.3,22.1,55.4};
        Character[] charArray = {'H','Z','K','M'};

        System.out.println("整型数组元素为：");
        printArray(intArray);

        System.out.println("\n双精度型数组元素为：");
        printArray(doubleArray);

        System.out.println("\n字符数组元素为：");
        printArray(charArray);
    }
}

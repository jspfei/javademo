package string;

/**
 * Created by admin on 2017/4/18.
 */
public class StringDemo {
    public static void main(String args[]){
        char[] hellws = {'r','r','s','o','b'};
        String helloString = new String(hellws);
        System.out.println(helloString);

        int len = helloString.length();
        System.out.println("长度  "+len);

        String name = "My name is ";
        String k = name.concat(helloString);

        System.out.println(k);

        String fs;
        fs = String.format("年龄  "+"%d \n价格  "+"%f \n姓名  "+"%s" ,10 ,20.0,"土豆");
        System.out.println(fs);

        System.out.println(fs.charAt(9));
        System.out.println(k.compareTo(fs));

        String email = "jjj@163.com";
        System.out.println(email.endsWith("163.com"));
        System.out.println(email.getBytes());
        System.out.println(email.hashCode());
    }
}

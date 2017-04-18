package charter;

import static java.lang.Character.*;

/**
 * Created by admin on 2017/4/18.
 */
public class TestCharter {
    public static void main(String args[]){
        char ch ='q';
        char uniChar ='\u039A';
        char[] charAry = {'a','b','c','d'};

        String s = "\t \b  \n \r \f \' \" \\";
        System.out.println(s);

        Character k = 's';
        System.out.println(" "+(k));
        System.out.println("字母 "+isLetter(k));
        System.out.println("数字 "+isDigit(k));
        System.out.println("空格 "+isWhitespace(k));
        System.out.println("大写字母 "+isUpperCase(k));
        System.out.println("小写字母 "+isLowerCase(k));
        System.out.println("指定大写 "+toUpperCase(k));
        System.out.println("指定小写 "+toLowerCase(k));
        System.out.println("String "+k.toString());


    }
}

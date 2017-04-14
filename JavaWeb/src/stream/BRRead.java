package stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**使用 BufferedReader 在控制台读取字符
 * Created by admin on 2017/4/14.
 */
public class BRRead {
    public static void main(String args[]) throws IOException{
        char c;
        //使用System.in 创建BufferedReader
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("输入字符 ，按下q 建退出");
        //读取字符
        do{
            c = (char) br.read();
            System.out.println(c);
        }while(c !='q');
    }
}

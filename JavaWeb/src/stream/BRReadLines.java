package stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 2017/4/14.
 */
public class BRReadLines {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do{
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("end"));
    }
}
package stream;

import java.io.*;

/**
 * Created by admin on 2017/4/14.
 */
public class FileSteamTest {
    public static void main(String args[]){
        try{
            byte bWrite[] = {11,21,33,12,5};
            OutputStream os = new FileOutputStream("e:\\java\\test.txt");
            for(int x = 0;x<bWrite.length;x++){
                os.write(bWrite[x]);
            }
            os.close();

            InputStream is = new FileInputStream("e:\\java\\test.txt");
            int size = is.available();

            for(int i=0;i<size;i++){
                System.out.println((char)is.read()+" ");
            }
            is.close();
        }catch (IOException o){
            o.printStackTrace();
        }
    }
}

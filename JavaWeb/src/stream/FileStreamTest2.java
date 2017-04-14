package stream;

import java.io.*;

/**
 * Created by admin on 2017/4/14.
 */
public class FileStreamTest2 {

    public static void main(String args[])throws IOException{

        File f = new File("e:\\java\\a.txt");
        FileOutputStream fout = new FileOutputStream(f);
        //文件不存在会自动新建

        OutputStreamWriter writer = new OutputStreamWriter(fout,"utf-8");
        writer.append("输入中文");
        writer.append("\r\n");
        writer.append("English");
        writer.close();

        FileInputStream fip = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fip,"utf-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            sb.append((char) reader.read());
        }
        System.out.println(sb.toString());
        reader.close();

        fip.close();
    }
}

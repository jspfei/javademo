package stream;

import java.io.File;

/**
 * Created by admin on 2017/4/14.
 */
public class DirList {
    public static void main(String args[]){
        String dirname = "e:\\java\\tmp";
        File f = new File(dirname);
        if(f.isDirectory()){
            System.out.println("目录" +dirname);
            String s[] = f.list();
            for(int i = 0;i<s.length;i++){
                File f1 = new File(dirname +"/"+s[i]);
                if(f.isDirectory()){
                    System.out.println(s[i] +" 是一个目录");
                }else{
                    System.out.println(s[i] +" 是一个文件");
                }
            }
        }else {
            System.out.println(dirname +" 不是一个目录");
        }
    }
}

package stream;

import java.io.File;

/**
 * c创建文件夹
 * Created by admin on 2017/4/14.
 */
public class CreateDir {
    public static void main(String args[]){
        String dirname = "e:\\java\\tmp\\bin";
        File d = new File(dirname);
        d.mkdirs();
    }
}

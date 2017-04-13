package pool;

import java.io.File;

/**
 * 打印文件结构
 * Created by admin on 2017/4/13.
 */
public class PrintDirectory {
    public static void printDirectory(File file) {
        System.out.println("------------file---------------"+file.getName());
        File[] childFiles = file.listFiles();
        for (File childFile : childFiles) {
            if (childFile.isDirectory()) {
                printDirectory(childFile);
            }
            System.out.println(childFile.getName());
        }
    }
}

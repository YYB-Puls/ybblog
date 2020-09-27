package Exercises.Topice18.Exercise2;

import java.io.File;
import java.nio.file.Path;

/**
 * 习题2:
 *      删除文件:通过命令行接收文件路径,在程序中将这个文件夹中的所有文件删除,
 *
 */
public class DeleFile {
    public static void main(String[] args) {
        String forPath = "D:\\DataFile";
        File file = new File(forPath);
        String[] tempList = file.list();
        for (int i = 0 ; i < tempList.length; i++){
            File temp = new File(forPath+File.separator +tempList[i]);
            boolean deleFile = temp.delete();
            if (deleFile) {
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
                continue;
            }
        }
    }
}

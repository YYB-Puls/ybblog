package Exercises.Topice18.Exercise1;

import java.io.File;
import java.io.IOException;

/**
 * 习题1:
 *      创建文件:通过命令行接收文件路径,在程序中创建这个文件和必要的文件夹
 *      输出创建文件的结果
 */
public class DataFile {
    public static void main(String[] args) {
        String forPath = "D:"+File.separator+"DataFile";
        String fileName = "DataFile.txt";
        File dateFile = new File(forPath);
        if (dateFile.isFile() && dateFile.exists()){
            System.out.println("文件夹已存在");
            return;
        }else {
            boolean createFolder = dateFile.mkdir();
            if (createFolder) {
                System.out.println("文件夹创建成功");
            }else {
                System.out.println("文件夹创建失败!");
                return;
            }
        }
        File file = new File(dateFile,fileName);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");

        }catch (IOException e){
            System.out.println("文件创建失败,错误信息:"+e.getMessage());
            return;
        }
    }
}

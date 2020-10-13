package Exercises.Topice18.Exercise1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 习题1:
 *      创建文件:通过命令行接收文件路径,在程序中创建这个文件和必要的文件夹
 *      输出创建文件的结果
 */
public class DataFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入目录名");
        String mlm = input.nextLine();
        System.out.println("请输入文件名:");
        String wjm = input.nextLine();
        File dateFile = new File(mlm);
        if (dateFile.isFile() && dateFile.exists()){
            System.out.println("文件夹已存在");
        }else {
            boolean createFolder = dateFile.mkdir();
            if (createFolder) {
                System.out.println("文件夹创建成功");
            }else {
                System.out.println("文件夹创建失败!");
                return;
            }
        }
        File file = new File(dateFile, wjm);

        try {
            boolean newFile = file.createNewFile();
            System.out.println("文件创建成功:"+newFile);

        }catch (IOException e){
            System.out.println("文件创建失败,错误信息:"+e.getMessage());
        }
    }
}

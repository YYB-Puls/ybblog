package Exercises.Topice18.Exercise2;

import java.io.File;
import java.util.Scanner;

/**
 * 习题2:
 *      删除文件:通过命令行接收文件路径,在程序中将这个文件夹中的所有文件删除,
 */
public class DeleFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String forPath = scanner.nextLine();
        File file = new File(forPath);
        String[] tempList = file.list();
        for (String aTempList : tempList) {
            File temp = new File(forPath + File.separator + aTempList);
            boolean deleFile = temp.delete();
            if (deleFile) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        }
    }
}

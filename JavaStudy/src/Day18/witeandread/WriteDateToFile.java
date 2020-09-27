package Day18.witeandread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDateToFile {
    public static void main(String[] args) {
        File dateFile = new File("D:\\dateFile.txt");
        if (dateFile.exists() && dateFile.isFile()) {
            System.out.println("使用已经存在的dateFile.txt文件");

        }else {
            try {
                dateFile.createNewFile();
                System.out.println("创建dateFile.txt文件");

            }catch (IOException e){
                System.out.println("创建dateFile.txt文件失败,错误信息:"+e.getMessage());
                return;
            }
            try {
                PrintWriter pw  = new PrintWriter(dateFile);
                pw.write("向文件写入数据");
                pw.close();
            }catch (FileNotFoundException e){
                System.out.println("找不到文件,错误信息:"+e.getMessage());
            }
        }
    }
}

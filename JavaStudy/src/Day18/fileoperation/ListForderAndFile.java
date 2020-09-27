package Day18.fileoperation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListForderAndFile {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("程序需要一个文件夹路径作为参数");
            return;
        }
        String folderPath = args[0];
        File folder = new File(folderPath);
        if (!folder.exists()){
            System.out.println(folderPath + "不是有效的路径!");
            return;
        }
        if (!folder.isDirectory()){
            System.out.println(folderPath+"不是有效文件夹");
            return;
        }
        File[] allFiles = folder.listFiles();
        List files = new ArrayList();
        List folders = new ArrayList();
        for (int i = 0 ; i < allFiles.length; i++){
            if (allFiles[i].isFile()){
                files.add(allFiles[i]);
            }else {
                folders.add(allFiles[i]);
            }
        }
        //分别输出文件和文件夹
        System.out.println("文件夹:"+folderPath+"包含以下文件:");
        printPath(files);
        System.out.println();
        System.out.println("文件夹:"+folderPath+"包含以下文件:");
        printPath(folders);


    }
    public static void printPath(List list){
        for (int i = 0; i < list.size(); i++){
            File fileList =  (File) list.get(i);
            System.out.print(fileList.getName()+",");
        }
    }
}

package Day18.fileoperation;

import java.io.File;
import java.io.IOException;

public class CreateFileAndFolder {
    public static void main(String[] args) {
        String folderPath = "D:"+ File.separator+"javaeasy";
        String fileName = "testingfolder.txt";
        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()){
            System.out.println("该文件已存在");
        }else {
            boolean careatFolders = folder.mkdir();
            if (careatFolders){
                System.out.println("文件创建成功");

            }else {
                System.out.println("文件创建失败");
                return;
            }
        }
        File file = new File(folder,fileName) ;
        if (file.exists() && file.isFile()){
            System.out.println("文件已经存在,将文件删除");
            boolean deleteFile = file.delete();
            if (deleteFile){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
                return;
            }
        }
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        }catch (IOException e){
            System.out.println("文件创建失败,信息错误"+e.toString());
        }
    }
}

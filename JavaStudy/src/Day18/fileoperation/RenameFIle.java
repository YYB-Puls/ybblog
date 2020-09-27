package Day18.fileoperation;

import java.io.File;

public class RenameFIle {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("程序需要一个文件路径作为参数");
            return;
        }
        String folderPath = args[0];
        File file = new File(folderPath);
        if (!file.exists()){
            System.out.println(folderPath + "不是有效的路径!");
            return;
        }
        if (!file.isFile()) {
            System.out.println(folderPath + "不是有效文件!");
            return;
        }
        File renameFile = new File(file.getParentFile(),"renamedFile");
        if (renameFile.exists()) {
            System.out.println("文件名已被占用");
            return;
        }
        if (file.renameTo(renameFile)) {
            System.out.println("文件重命名成功");
        }else{
            System.out.println("文件重命名失败");
        }

    }
}

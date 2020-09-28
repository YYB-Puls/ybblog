package Exercises.Topice18.Exercise3;

import java.io.*;

/**
 * 习题3:
 *      实现文件复制:通过命令行传递源文件路径和目录文件路径,然后读取源文件内容
 *      将源文件内容复制到目标文件
 *      如果目标文件不存在则首先创建目录文件
 */
public class CopyFile {
    public static void main(String[] args) {
        // todo 通过命令行，你这里是写死的，不符合题目要求
        File formerFile = new File("D:\\dateFile.txt");
        imput(formerFile);
        out();
    }

    public static void out(){
        File formerFile = new File("D:\\dateFile.txt");
        File file = new File("D:\\NewFile.txt");
        if (file.isFile() && file.exists()){
            System.out.println("文件已存在");
        }else {
            try {
                file.createNewFile();
                System.out.println("创建NewFile.txt文件");
            }catch (IOException e){
                System.out.println("创建出错,错误信息:"+e.getMessage());
                return;
            }
        }
        try {// todo 你试着用这个程序复制一个超过1024的记事本，记得自测，自测很重要
            String content = imput(formerFile);
            FileOutputStream fos = new FileOutputStream(content);
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            fos.close();
            System.out.println("数据写入成功");
        }catch (IOException e){
            System.out.println("输入内容出错,错误信息 为:"+e.getMessage());
        }
    }

    public static String imput (File file){
        if (file.isFile() ){
            System.out.println("开始读取数据!");
        }else {
            System.out.println("未找到文件!");
// todo 找不到文件还能继续往下读取啥呢？
        }
        System.out.print("文件内容:");
        String content = null;
        try {
            // todo 如果你的文件内容超过1024个字，你会发现后面的你打印不出来，因为你这个功能不能读取文件全部内容
            FileInputStream fis = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int len = fis.read(bytes);
            content = new String(bytes,0,len);
            System.out.println(content);
            fis.close();
        }catch (FileNotFoundException e){
            System.out.println("找不到文件,错误信息:"+e.getMessage());
            // todo 目标文件不存在也没有按要求创建
        }catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }
}

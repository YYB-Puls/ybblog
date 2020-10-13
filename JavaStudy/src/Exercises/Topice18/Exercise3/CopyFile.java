package Exercises.Topice18.Exercise3;

import java.io.*;
import java.util.Scanner;

/**
 * 习题3:
 *      实现文件复制:通过命令行传递源文件路径和目录文件路径,然后读取源文件内容
 *      将源文件内容复制到目标文件
 *      如果目标文件不存在则首先创建目录文件
 */
// FIXME: 2020/10/13 空指针异常
public class CopyFile {
    private static String wjm;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要复制的文件路径");
        wjm = scanner.nextLine();
        File formerFile = new File(wjm);
        imput(formerFile);
        out();
    }

    public static void out(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入的文件路径");
        String newWjm = scanner.nextLine();
        File file = new File(newWjm);
        if (file.isFile() && file.exists()){
            System.out.println("文件已存在");
        }else {
            try {
                file.createNewFile();
                System.out.println("创建"+newWjm+"文件");
            }catch (IOException e){
                System.out.println("创建出错,错误信息:"+e.getMessage());
                return;
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            byte[] bytes = imput(file).getBytes();
            fos.write(bytes);
            fos.close();
            System.out.println("数据写入成功");
        }catch (IOException e){
            System.out.println("输入内容出错,错误信息 为:"+e.getMessage());
        }
    }

    public static String imput (File file) throws IOException {
        if (file.exists() ){
            System.out.println("开始读取数据!");
        }else {
            System.out.println("文件不存在");
            boolean dataFile = file.createNewFile();
            System.out.println(dataFile?"创建成功":"创建失败");
        }
        System.out.print("文件内容:");
        String content = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int len ;
            while ((len= fis.read(bytes)) != -1){
                content = new String(bytes,0,len,"UTF-8");
                System.out.println(content);
            }
            fis.close();
        }catch (FileNotFoundException e){
            System.out.println("找不到文件,错误信息:"+e.getMessage());
            // todo 目标文件不存在也没有按要求创建（题目：如果目标文件不存在则首先创建目录文件？？？）
        }catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }
}

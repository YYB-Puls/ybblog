package Exercises.Topice19;

import Exercises.Topice20.Execise03;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 发送数据
 *          要求:从命令行读取两个参数,第一个参数为文件路径,第二个参数为远程ip地址
 *          程序读取文件内容,并通过tcp协议将文件内容发送到指定ip的9999端口
 */
public class Exercise02 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件路径:");
        String padh = scanner.nextLine();
        File file = new File(padh);
        System.out.println("请输入目标IP地址:");
        String ip = scanner.nextLine();
        String s = duWenJian(file);
        client(ip,s );

    }

    public static void client(String str,String s) throws IOException {
        Socket socket = new Socket(str,9999);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(s);
        bw.flush();
        bw.close();
    }


    public static String duWenJian(File file){
        if (file.exists()) {
            System.out.println("文件存在");
        }else{
           return "文件不存在";
        }

        System.out.println("文件内容:");
        String wenJianNeiRong = null;
        try {
            FileInputStream input = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int len;
            while ((len = input.read(bytes)) != -1){
                wenJianNeiRong = new String(bytes,0,len,"UTF-8") ;
                System.out.println(wenJianNeiRong);
            }
            input.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wenJianNeiRong;
    }
}

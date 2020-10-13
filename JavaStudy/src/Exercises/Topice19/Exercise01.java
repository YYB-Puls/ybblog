package Exercises.Topice19;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 19章第1题
 * 接收数据
 *      要求:通过使用tcp协议,在端口9999监听,建立连接之后将所有接收到的数据保存到一个文件中
 *      todo 这个程序只实现了接收但是没有实现发送，你没办法测试的
 *
 */
public class Exercise01 {
    private static boolean isRun = false;
    private static BufferedReader br;
    private static BufferedWriter bw;
    public static void main(String[] args) {
        start();
        stop();
    }

    private static void stop(){
        isRun = false;
        try {
            br.close();
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void start(){
        try {
            ServerSocket server = new ServerSocket(9999);
            Socket s = server.accept();
            System.out.println("客户端:"+InetAddress.getLocalHost()+"已连接到服务器");
            isRun = true;
            while (isRun){
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String mess = br.readLine();
                System.out.println("客服端:"+mess);
                bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入:");
                String str = scanner.nextLine();
                if (str.equals("ext")){
                    System.out.println("退出!");
                    break;
                }
                bw.write(str);
                bw.flush();
            }
        }catch (UnknownHostException e){
            System.out.println("无法找到相应的机器,错误信息如下:"+e.getMessage());
        }catch (IOException e){
            System.out.println("数据传输异常:"+e.getMessage());
        }
    }
}

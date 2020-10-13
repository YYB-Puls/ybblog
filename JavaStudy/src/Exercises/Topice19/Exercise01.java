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
    public static void main(String[] args) throws IOException {
        String mess = start();
        FuZhiWenJian(mess);
        stop();
    }

    private static void FuZhiWenJian(String str) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入目录文件");
        String paoh = scanner.nextLine();
        File file = new File(paoh);
        if (file.exists()) {
            System.out.println("开始写入:");
        }else{
            System.out.println("文件不存在,开始创建:");
            file.createNewFile();
        }
        FileOutputStream outputStream = new FileOutputStream(file);
        byte[] bytes = str.getBytes();
        outputStream.write(bytes);
        outputStream.flush();
        System.out.println("传送成功");
        outputStream.close();
    }

    private static void stop(){
        isRun = false;
        try {
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String start(){
        String mess = null;
        try {
            ServerSocket server = new ServerSocket(9999);
            Socket s = server.accept();
            System.out.println("客户端:"+InetAddress.getLocalHost()+"已连接到服务器");
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                mess = br.readLine();
                System.out.println("客服端:"+mess);
        }catch (UnknownHostException e){
            System.out.println("无法找到相应的机器,错误信息如下:"+e.getMessage());
        }catch (IOException e){
            System.out.println("数据传输异常:"+e.getMessage());
        }
        return mess;
    }
}

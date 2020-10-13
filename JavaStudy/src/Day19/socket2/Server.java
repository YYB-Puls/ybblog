package Day19.socket2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static boolean isRun = false;

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8888);
            System.out.println("启动服务器");
            Socket s = server.accept();
            System.out.println("客户端:" + s.getInetAddress().getLocalHost() + "已连接到服务器");
            isRun = true;

            InputStream inputStream = s.getInputStream();
            byte[] bytes = new byte[1024];
            int len;
            while ((len=inputStream.read(bytes)) != -1){
                String s1 = new String(bytes , 0 ,len ,"UTF-8");
                System.out.println(s1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

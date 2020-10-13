package Day19.socket2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        boolean isRun = false;
        try {
            ServerSocket server = new ServerSocket(8888);
            System.out.println("启动服务器");
            Socket s = server.accept();
            System.out.println("客户端:" + s.getInetAddress().getLocalHost() + "已连接到服务器");
            /*InputStream inputStream = s.getInputStream();
            byte[] bytes = new byte[1024];
            int len;
            while ((len=inputStream.read(bytes)) != -1){
                String s1 = new String(bytes , 0 ,len ,"UTF-8");
                System.out.println(s1);
            }*/
            isRun = true;
            while (isRun){
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String mess = br.readLine();
                System.out.println("客户端："+mess);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入:");
                String s1 = scanner.nextLine();
                if (s1.equals("ext")){
                    System.out.println("程序结束!");
                    break;
                }
                bw.write(s1+"\n");
                bw.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

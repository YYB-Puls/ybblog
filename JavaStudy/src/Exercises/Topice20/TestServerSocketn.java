package Exercises.Topice20;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestServerSocketn {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待连接...............");
        Socket socket = serverSocket.accept();
        System.out.println("已有客户端连接..............");
        Scanner input = new Scanner(System.in);
        System.out.println("请输入文件路径:");
        String s = input.nextLine();

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String response = reader.readLine();
        chuanSongWenJian(s,response);
        reader.close();
    }

    private static void chuanSongWenJian(String s,String response) throws IOException {
        File file = new File(s);
        FileOutputStream fos = new FileOutputStream(file);
        byte[] contentBytes = response.getBytes();
        fos.write(contentBytes);
        fos.close();
        System.out.println("写入成功");
    }

}

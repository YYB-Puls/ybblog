package Exercises.Topice19;

import Day19.learnsockettcp.Server;
import Exercises.Topice18.Exercise1.DataFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 19章第1题
 * 接收数据
 *      要求:通过使用tcp协议,在端口9999监听,建立连接之后将所有接收到的数据保存到一个文件中
 *
 */
public class Exercise01 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            System.out.println("服务端在9999端口监听......");
            Socket s = ss.accept();
            System.out.println("已有客户端连接,接收数据中......");
            InputStream in = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String respons = br.readLine();
            System.out.println(respons);
            File dataFile = new File("D:\\Exercie.txt");
            dataFile.createNewFile();
            System.out.println("创建文件");
            PrintWriter pw = new PrintWriter(dataFile);
            pw.write(respons );
            pw.close();
            br.close();
            s.close();
            ss.close();
        }catch (UnknownHostException e){
            System.out.println("无法找到相应的机器,错误信息如下:"+e.getMessage());
        }catch (IOException e){
            System.out.println("数据传输异常:"+e.getMessage());
        }
    }
}

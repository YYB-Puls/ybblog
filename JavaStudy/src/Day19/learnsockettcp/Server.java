package Day19.learnsockettcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(7777);
            System.out.println("服务器端在7777端口监听.....");
            Socket s = ss.accept();
            System.out.println("已有客户端链接过来,开始进行通信.....");
            InputStream in = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            System.out.println("正在向客户端发送消息.....");
            pw.write("客户端,你好,这里是服务端");
            pw.flush();
            System.out.println("向客户端发送消息成功");
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String response = br.readLine();
            System.out.println("====下面是客户端发来的消息======");
            System.out.println(response);
            System.out.println("================================");
            br.close();
            pw.close();
            s.close();
            ss.close();
        }catch (UnknownHostException e){
            System.out.println("无法找到相应的机器,错误信息:"+e.getMessage());

        }catch (IOException e){
            System.out.println("数据传输错误,错误信息:"+e.getMessage());

        }
    }
}

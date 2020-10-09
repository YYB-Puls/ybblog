package Day19.learnsockettcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        byte[] addr = new byte[]{127,0,0,1};
        try {
            InetAddress local = InetAddress.getByAddress(addr);
            Socket s = new Socket(local,7777);
            System.out.println("已连接服务端");
            InputStream in = s.getInputStream();
            OutputStream os = s.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            System.out.println("获取服务端发来的消息");
            String respone = br.readLine();
            System.out.println("======下面是服务端发来的消息=========");
            System.out.println(respone);
            System.out.println("=======================================");
            System.out.println("正在向服务器发送消息.........");
            PrintWriter pw = new PrintWriter(os);
            pw.write("服务端你好,这里是客户端");
            pw.flush();
            pw.close();
            br.close();
            s.close();
            System.out.println("向服务器端发送消息结束");

        }catch (UnknownHostException e){
            System.out.println("无法找到相应的机器,错误消息:"+e.getMessage());

        }catch (IOException e){
            System.out.println("数据传输异常:"+e.getMessage());
        }
    }
}

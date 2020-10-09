package Day19.learnsocktudp;

import sun.security.util.Length;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPReceive {
    public static void main(String[] args) {
        try {
            //构造器用于接收数据的DatagramPacket对象
            System.out.println("构建DatagramPacket对象.......");
            byte[] data = new byte[1024];
            DatagramPacket dp = new DatagramPacket(data,data.length);
            System.out.println("使用DatagramPacke对象接收数据");
            DatagramSocket ds = new DatagramSocket(7777);
            //等待数据来
            ds.receive(dp);
            System.out.println("数据接收完毕");
            //分析数据,输出控制台
            byte[] recData = dp.getData();
            int len = dp.getLength();
            String content = new String(recData,0,len) ;
            System.out.println("接收到的数据为:"+content);
            ds.close();
        }catch (SocketException e){
            e.printStackTrace();
        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

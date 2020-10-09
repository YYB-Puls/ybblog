package Day19.learnsocktudp;

import java.io.IOException;
import java.net.*;

public class UDPSender {
    public static void main(String[] args) {
        try {
            //构建一个用于发送数据的DatagramPacket对象,包括数据.目的ip地址和目标端口
            System.out.println("构建datagramPacket对象......");
            String content = "使用UDP传输数据";
            byte[] data = content.getBytes();
            DatagramPacket dp = new DatagramPacket(data,data.length );
            byte[] addr = new byte[]{127,0,0,1};
            InetAddress local = InetAddress.getByAddress(addr);
            dp.setAddress(local);
            dp.setPort(7777);
            System.out.println("发送DatagramPacket对象");
            DatagramSocket ds = new DatagramSocket();
            ds.send(dp);
            System.out.println("发送结束");
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

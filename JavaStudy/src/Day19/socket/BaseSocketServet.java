package Day19.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class BaseSocketServet {
    private ServerSocket server;
    private Socket socket;
    private int port;
    private InputStream inputStream;
    private OutputStream outputStream;
    private static int MAX_BUFFER_SIZE = 1024;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public BaseSocketServet(int port) {
        this.port = port;
    }

    public void runServer() throws IOException {
        this.server = new ServerSocket(port);
        System.out.println("base socket server started.");
        this.socket = server.accept();
        this.inputStream = socket.getInputStream();
        String message = readAllBytes();
        Scanner input = new Scanner(this.inputStream);
        while (input.hasNextLine()){
            System.out.println("get info from client"+input.nextLine());
        }
        this.inputStream.close();
        socket.close();
    }

    private String readAllBytes() throws IOException {
        byte[] readBytes = new byte[MAX_BUFFER_SIZE];
        int msgLen;
        StringBuilder stringBuilder = new StringBuilder();
        while ((msgLen = inputStream.read(readBytes)) != -1) {
            String readedStr = new String(readBytes, 0, msgLen, "UTF-8");
            stringBuilder.append(readedStr);
        }
        return stringBuilder.toString();

    }

    /*  public void runServerSingle() throws IOException{
        this.server = new ServerSocket(this.port);
         System.out.println("base socket server started");
         this.socket = server.accept();
         this.inputStream = this.socket.getInputStream();
         byte[] readBytes = new byte[MAX_BUFFER_SIZE];
         int msgLen;
         StringBuilder stringBuilder = new StringBuilder();
         while ((msgLen = inputStream.read(readBytes)) != 1){
             stringBuilder.append(new String(readBytes,0,msgLen,"UTF-8"));
             System.out.println("get message from client :"+ stringBuilder);
             inputStream.close();
             socket.close();
             server.close();
         }
     }*/
    public static void main(String[] args) {
        BaseSocketServet bs = new BaseSocketServet(9799);
        try {
            bs.runServer();
            //bs.runServerSingle();
            System.out.println("程序关闭");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

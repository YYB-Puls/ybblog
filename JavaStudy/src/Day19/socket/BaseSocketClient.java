package Day19.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Scanner;

public class BaseSocketClient {
    private String serverHost;
    private int serverPort;
    private Socket socket;
    private OutputStream outputStream;
    private InputStream inputStream;
    private static int MAX_BUFFER_SIZE = 1024;

    public BaseSocketClient(String serverHost, int serverPort){
        this.serverHost = serverHost;
        this.serverPort = serverPort;
    }

    public void connentServer() throws IOException{
        this.socket = new Socket(this.serverHost ,this.serverPort);
        this.outputStream = socket.getOutputStream();
    }

    public void sendMessage(String message)throws IOException{
        String sendMsg = message+"\n";
        try {
            this.outputStream.write(sendMsg.getBytes("UTF-8"));

        }catch (UnsupportedEncodingException e){
            System.out.println(e.getMessage());
        }
        this.outputStream.close();
        this.socket.shutdownOutput();
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

    /*public void sendSingle(String message) throws IOException{
        try {
            this.outputStream.write(message.getBytes("UTF-8"));

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        this.outputStream.close();
        this.socket.close();
    }*/

    public static void main(String[] args){
        BaseSocketClient bc = new BaseSocketClient("127.0.0.1",9799 );
        try {
            bc.connentServer();
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()){
                String line = sc.nextLine();
                bc.sendMessage(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

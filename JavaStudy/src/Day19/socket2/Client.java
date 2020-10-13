package Day19.socket2;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        boolean isRun = false;
        try {
            Socket socket = new Socket("127.0.0.1",8888);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            PrintWriter bw = new PrintWriter(new OutputStreamWriter(outputStream));
            isRun = true;
            Scanner scanner = new Scanner(System.in);

            while (isRun){
                System.out.println("请输入:");
                String input = scanner.nextLine();
                if (input.equals("ext") ){
                    System.out.println("程序关闭");
                    break;
                }
                bw.write(input+"\n");
                bw.flush();
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
                String s = br.readLine();
                System.out.println("服务器:"+s);

            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

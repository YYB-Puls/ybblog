package Day19.socket;





import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        int port = 5533;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("server将一直等待连接的到来");
        ExecutorService threadPool = Executors.newFixedThreadPool(100);
        while (true){
            final Socket socket = serverSocket.accept();
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream inputStream = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int len;
                        StringBuilder sb = new StringBuilder();
                        while ((len = inputStream.read(bytes)) != -1) {
                            sb.append(new String(bytes, 0, len, "UTF-8"));
                        }
                        System.out.println("get message from client :"+ sb);
                        inputStream.close();
                        socket.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            };
            threadPool.submit(runnable);
        }
    }
}

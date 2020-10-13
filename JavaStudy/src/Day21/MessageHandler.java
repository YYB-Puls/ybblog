package Day21;

import java.net.SocketAddress;

public interface  MessageHandler {
    void handleMessage(byte[] data, SocketAddress address);
}

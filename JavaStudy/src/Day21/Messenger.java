package Day21;

import java.net.SocketAddress;

public interface Messenger {
    //代表UDP消息收发模块的接口设置消息处理器
    public void setMessageHandle(Messenger message);
    //发送消息
    public void sendData(byte[] data, SocketAddress address);
    //启动消息模块
    public void startMessenger();
}

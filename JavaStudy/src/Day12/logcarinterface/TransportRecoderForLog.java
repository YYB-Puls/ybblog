package Day12.logcarinterface;

import Day12.Bike;
import Day12.CarBase;

public class TransportRecoderForLog {
    public static int counter = 0;
    public static void recoordTransport(RecordeAble recordeAble){
        if (recordeAble == null){
            return;
        }else {
            counter ++;
            TransportStatusForLog status  = recordeAble.getTransportStatus();
            System.out.println("以下是经过的第:"+counter + "个交通工具的信息");
            System.out.println("交通工具名字为:"+status.getName()+"车速为:"+status.getSpeed());
        }
    }
}

package Day12;

public class TransportRecorder {
    public static int counter = 0;
    public static void recoordTransport(Object transporrObj){
        if (transporrObj == null){
            return;
        }else {
            counter ++;
            TransportStatus status  = null;
            if (transporrObj instanceof  CarBase){
                CarBase carBase = (CarBase) transporrObj;
                status = carBase .getCarStatus();
            }else if (transporrObj instanceof  Bike){
                Bike bike = (Bike) transporrObj;
                status = bike.getBikeStatus();
            }else {
                return;
            }
            System.out.println("以下是经过的第:"+counter + "个交通工具的信息");
            System.out.println("交通工具名字为:"+status.getName()+"车速为:"+status.getSpeed());
        }
    }
}

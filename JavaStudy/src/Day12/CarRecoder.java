package Day12;

public class CarRecoder {
    public static int counter = 0;
    public static void recordCar(CarBase car){
        if (car == null){
            return;
        }else {
            counter ++;
            CarStatus status  = car.getCarStatus();
            System.out.println("以下是经过的第"+counter+"辆车的信息;");
            System.out.println("车为:"+status.getName()+",车速为:"+status.getSpeed());
        }
    }
}

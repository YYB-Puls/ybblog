package Day09;

public class CarOverload {
    public double speed;
    /*public void raiseSpeed(int p_speed){
        System.out.println("签名为raiseSpeed(int)的方法被调用了");
        double tempSpeed = speed + p_speed;
        speed = tempSpeed;
    }*/


    public void raiseSpeed(double p_speed){
        System.out.println("签名为raiseSpeed(double)的方法被调用了");
        double tempSpeed = speed + p_speed;
        speed = tempSpeed;
    }
}

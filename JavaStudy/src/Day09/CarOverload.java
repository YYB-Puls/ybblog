package Day09;

public class CarOverload {
    public int speed;
    public void raiseSpeed(int p_speed){
        int tempSpeed = speed + p_speed;
        speed = tempSpeed;
    }
    public void raiseSpeed(int p_speed,int limited){
        int tempSpeed = speed + p_speed;
        if (tempSpeed < limited){
            speed = tempSpeed;
        }else {
            speed = limited;
        }
    }
}

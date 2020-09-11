package Day11;

public class CarBase {
    public int speed;
    public static int MAX_SPEED = 90;

    public void speedUP(int p_speed){
        int tempSpeed = 0;
        if(p_speed > 0){
            tempSpeed = speed + p_speed;
        }
        if (tempSpeed <= MAX_SPEED){
            speed = tempSpeed;
        }
    }

    public void slowDown(int p_speed){
        if (p_speed > 0){
            int tempSpeed = speed - p_speed;
            if (tempSpeed > 0){
                speed = tempSpeed;
            }
        }
    }
}

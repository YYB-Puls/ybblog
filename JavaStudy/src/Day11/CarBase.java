package Day11;

public class CarBase {
    public int speed;
    public static int MAX_SPEED = 90;

    public int getSpeed (){
        return speed;
    }

    public void setSpeed(int p_speed){
        this.speed = p_speed;
    }

    public static int getMaxSpeed(){
        return MAX_SPEED;
    }

    public static void setMaxSpeed(int MAX_SPEED){
        MAX_SPEED = MAX_SPEED;
    }

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

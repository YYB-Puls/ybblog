package Day11;

public class SimpleCar {
    public static int MAX_SPEED = 90;
    public int speed = 0;

    public void setSpeed(int p_speed){
        if (p_speed < MAX_SPEED){
            this.speed = p_speed;
        } else{
            this.speed = MAX_SPEED;
        }
    }
    public static void setMaxSpeed(int maxSpeed){
        MAX_SPEED = maxSpeed;
    }
}

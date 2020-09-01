package Day08.Method;

public class Car {
    int speed;
    String color;
    String name;
    String direaction;

    public void direaCar(){
        speed = 50;
        direaction = "南方";
    }

    //给汽车加速
    public void raiseSpeed (int p_speed){
        int currentSpeed = speed + p_speed;
        speed = speed + p_speed;
    }
}

package Day12;

public class CarStatus {
    private String name ;
    private int speed;

    public  CarStatus(String name , int speed){
        this.speed = speed;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getSpeed (){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
}

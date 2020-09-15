package Day12.logcarinterface;

public class TransportStatusForLog {
    private String name;    //用于记录经过车辆的名字
    private int speed;      //用于记录经过车辆的速度

    public TransportStatusForLog(String name , int speed){
        this.name = name;
        this.speed = speed;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name ;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
}

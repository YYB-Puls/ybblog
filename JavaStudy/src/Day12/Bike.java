package Day12;

public class Bike {
    private int speed ;
    private String name;

    public CarStatus getBikeStatus(){
        CarStatus carStatus = new CarStatus(name ,speed );
        return carStatus;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        if (speed < 0){
            return;
        }else {
            this.speed = speed;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name == null){
            return;
        }else {
            this.name = name ;
        }
    }
}

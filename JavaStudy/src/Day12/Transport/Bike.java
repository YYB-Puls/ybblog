package Day12.Transport;

import Day12.TransportStatus;
import Day12.logcarinterface.RecordeAble;
import Day12.logcarinterface.TransportStatusForLog;

public class Bike implements RecordeAble {
    private int speed ;
    private String name;

    public TransportStatusForLog getTransportStatus(){
        TransportStatusForLog status = new TransportStatusForLog(name ,speed );
        return  status;
    }

    public TransportStatus getBikeStatus(){
        TransportStatus carStatus = new TransportStatus(name ,speed );
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

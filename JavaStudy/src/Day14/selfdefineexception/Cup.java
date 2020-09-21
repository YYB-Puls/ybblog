package Day14.selfdefineexception;

import Day09.Car;

public class Cup {
    private int capacity;
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity) throws CapacityTooBigException,CapacityTooSmallException{
        if (capacity > 10000 ){
            CapacityTooBigException bigException = new CapacityTooBigException("杯子的容积不能超过10000:"+capacity);
            throw bigException;
        }else if (capacity < 0){
            CapacityTooSmallException smallException = new CapacityTooSmallException("杯子的容积不能小于0:"+ capacity);
            throw smallException;
        }
        this.capacity =capacity;
    }

    /*public void setCapacity(int capacity) throws Exception{
        if (capacity > 10000 ){
            CapacityTooBigException bigException = new CapacityTooBigException("杯子的容积不能超过10000:"+capacity);
            throw bigException;
        }else if (capacity < 0){
            CapacityTooSmallException smallException = new CapacityTooSmallException("杯子的容积不能小于0:"+ capacity);
            throw smallException;
        }
        this.capacity =capacity;
    }*/
}

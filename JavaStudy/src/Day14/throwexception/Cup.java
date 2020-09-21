package Day14.throwexception;

public class Cup {
    private int capacity;
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity) throws Exception{
        if (capacity > 10000 || capacity < 0){
            Exception ex = new Exception("杯子的容积不能超过10000或小于0,非法的容积为:"+capacity);
            throw ex;
        }
        this.capacity =capacity;
    }
}

package Day14.selfdefineexception;

public class CupDesigner {
    private Cup cup;
    public CupDesigner(Cup cup){
        this.cup = cup;
    }
    public void designCupCapacity(int capacity) throws CapacityTooBigException,CapacityTooSmallException{
        cup.setCapacity(capacity);
        System.out.println("成功设计出了容积为:"+capacity+"的杯子");
    }
}

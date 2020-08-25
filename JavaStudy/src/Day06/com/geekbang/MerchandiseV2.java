package Day06.com.geekbang;

public class MerchandiseV2 {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public void describe(){
        System.out.println("商品名字叫做:"+name+",id是"+id+",商品售价是:"+soldPrice+",商品进价是:"+purchasePrice
                +"商品库存为:"+count+",销售一个毛利润是"+(soldPrice - purchasePrice));
    }
}

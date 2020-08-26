package Day06.com.geekbang;

public class MerchandiseAppMain {
    public static void main(String[] args) {
        Merchandise merchandise = new Merchandise();
        merchandise.name = "书桌";
        merchandise.soldPrice = 999.9;
        merchandise.purchasePrice = 500;
        merchandise.count = 40;
        merchandise.id = "DESK9527";

        System.out.println("商品名字叫做:"+merchandise.name+",id是"+merchandise.id+",商品售价是:"+merchandise.soldPrice+",商品进价是:"+merchandise.purchasePrice
        +"商品库存为:"+merchandise.count+",销售一个毛利润是"+(merchandise.soldPrice - merchandise.purchasePrice));

        merchandise.describe();
    }
}

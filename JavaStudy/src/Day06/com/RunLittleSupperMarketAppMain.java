package Day06.com;

import Day06.com.geekbang.LittleSuperMarket;
import Day06.com.geekbang.Merchandise;
import Day06.com.geekbang.MerchandiseV2;
import Day06.com.person.Customer;

import java.util.Scanner;

public class RunLittleSupperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.superMarketName = "有家超市";
        littleSuperMarket.address = "世纪大道9999";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandises = new Merchandise[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        Merchandise[] all = littleSuperMarket.merchandises;

        for (int i = 0; i < all.length; i++){
           Merchandise m = new Merchandise();
           m.count = 200;
           m.id = "ID"+i;
           m.name = "商品"+i;
           m.purchasePrice = Math.random() * 200;
           m.soldPrice = (1+Math.random()) * 200;
           all[i] = m;
        }
        System.out.println("超市开门了");
        boolean open = true;
        Scanner scanner = new Scanner(System.in);
        while (open){
            System.out.println("本店叫做"+littleSuperMarket.superMarketName);
            System.out.println("本店地址:"+littleSuperMarket.address);
            System.out.println("共有车位:"+littleSuperMarket.parkingCount);
            System.out.println("今天营业额为:"+littleSuperMarket.incomingSum);
            System.out.println("共有商品:"+littleSuperMarket.merchandises.length+"种");

            Customer customer = new Customer();
            customer.name = "顾客编号"+ (int)(1+Math.random() * 1000);
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivngCar = Math.random() > 0.5;

            if (customer.isDrivngCar){
                if (littleSuperMarket.parkingCount > 0){
                    littleSuperMarket.parkingCount --;
                    System.out.println("欢迎"+customer.name+"驾车而来,已安排车位,停车免费");
                }else {
                    System.out.println("车位已满,欢迎下次光临");
                    continue;
                }
            }else {
                System.out.println("欢迎"+customer.name+"来本店");
            }
            double totalCost = 0;
            while (true){
                System.out.println("本店提供"+all.length+"种商品,请选择编号");
                int index = scanner.nextInt();
                if (index < 0){
                    break;
                }
                if (index >= all.length){
                    System.out.println("本店没有该商品,请输入0到"+(all.length-1)+"的商品") ;
                }
                Merchandise m = all[index];
                System.out.println("您选购的商品名字"+m.name+",单价是:"+m.soldPrice+",请问要购买多少个");
                int numToby = scanner.nextInt();
                totalCost += numToby * m.soldPrice;
                m.count -= numToby;
                littleSuperMarket.merchandiseSold[index] += numToby;

            }
            customer.money -= totalCost;
            if (customer.isDrivngCar){
                littleSuperMarket.parkingCount ++;
            }
            System.out.println("顾客"+customer.name+"共消费了"+ totalCost);
            littleSuperMarket.incomingSum =  totalCost;
            System.out.println("还继续营业吗");
            open = scanner.nextBoolean();
        }
        System.out.println("超市关门了");
        System.out.println("今天总营业额为:"+littleSuperMarket.incomingSum+",营业情况如下");

        for (int i = 0; i < littleSuperMarket.merchandiseSold.length; i++){
            Merchandise m = all[i];
            int numSold = littleSuperMarket.merchandiseSold[i];
            if (numSold > 0 ){
                double incomming = m.soldPrice * numSold;
                double netIncomming = (m.soldPrice - m.purchasePrice) * numSold;
                System.out.println(m.name+"售出了"+numSold+"个,销售额为:"+incomming+",净利润为:"+netIncomming);
            }
        }
    }
}

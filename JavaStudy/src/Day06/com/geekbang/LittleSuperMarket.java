package Day06.com.geekbang;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public MerchandiseV2[] merchandises;
    public int[] merchandiseSold;

    public MerchandiseV2 getBinggestProfitMerchandise(){
        MerchandiseV2 curr = null;
        for (int i = 0; i < merchandises.length; i++){
            MerchandiseV2 m = merchandises[i];
            if (curr==null){
                curr = m;
                continue;
            }
            double currProfit = curr.calculatProfit();
            double newProfit = m.calculatProfit();
            if (currProfit < newProfit){
                curr = m;
            }
        }
        return curr;
    }

}

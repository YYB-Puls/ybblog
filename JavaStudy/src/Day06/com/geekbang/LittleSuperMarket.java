package Day06.com.geekbang;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public Merchandise[] merchandises;
    public int[] merchandiseSold;

    /*public MerchandisegetBinggestProfitMerchandise(){
        Merchandise curr = null;
        for (int i = 0; i < merchandises.length; i++){
            Merchandise m = merchandises[i];
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
    }*/

}

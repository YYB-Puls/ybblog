package Day06.com.geekbang;

public class MerchandiseV2AppMain {
    public static void main(String[] args) {
        MerchandiseV2 merchandise = new MerchandiseV2();
        merchandise.name = "书桌";
        merchandise.soldPrice = 999.9;
        merchandise.purchasePrice = 500;
        merchandise.count = 40;
        merchandise.id = "DESK9527";

        merchandise.describe();
    }

}

package Day15.property;



public class BankAccount {
    private int money = 0;
    //取钱方法
    public void getMoneyOutOfBank(int cash){
        if (cash < 0){
            System.out.println("取钱数额必须大于0");
            return;
        }
        if (money < cash){
            System.out.println("现金不足");
            return;
        }
        System.out.println("正在处理,请稍后........");
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("对不起,程序出错,错误信息:"+e.getMessage());
            return;
        }
        money = money - cash;
        System.out.println("取钱成功,请拿好现金:"+cash+"元,现在余额为:"+money+"元");
    }
    //存钱方法
    public void putMoneyToBank(int cash){
        if (cash < 0){
            System.out.println("存钱数额必须大于0");
            return;
        }
        System.out.println("正在处理存钱操作,请稍后.........");
        int tempMoney = money + cash;
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("对不起,程序出错,错误信息:"+e.getMessage());
            return;
        }
        money = tempMoney;
        System.out.println("存钱成功,金额为:"+ cash+"元,现在账号金额为:"+money+"元");
    }
    //  输出账户余额的方法
    public void peekMoney(){
        System.out.println("现在的账号余额为:"+money+"元");
    }
}

package Day15.property;

public class GetMoney implements Runnable {
    private  int cash ;
    private BankAccount account;
    public GetMoney(BankAccount account , int cash){
        this.cash = cash;
        this.account = account;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("线程\""+name+"\"开始取钱");
        account.getMoneyOutOfBank(cash);
        System.out.println("线程\""+name+"\"取钱完毕!\"");
    }
}

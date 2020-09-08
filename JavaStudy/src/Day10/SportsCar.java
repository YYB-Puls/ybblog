package Day10;

public class SportsCar extends Car{
    //保存氮气的剩余量
    public int  nAmount = 90;

    //使用氮气来让汽车加速的方法,代码中会首先根据剩余的氮气量来计算本次使用的氮气量
    public void speedUpUsingN(int p_amout){
        //表示真正用于加速的氮气量
        int realAmount = 0;
        //如果剩余氮气不能满足本次使用量
        if (nAmount <= p_amout){
            //则真正用于加速的氮气量就是所有剩余的氮气量
            realAmount = nAmount;
            //同事氮气量置为0
            nAmount = 0;
        }else {
            //否则,真正用于加速的氮气量就是p_amout的值
            realAmount = p_amout;
            //剩余氮气量减少p_amout
            nAmount -= p_amout;
        }
        int speedUp = (int ) (realAmount * 0.25);
        speed += speedUp;
    }
    //增加氮气
    public void addN(int p_amout){
        //如果需要增加的氮气小于0,则什么都不做
        if (p_amout < 0 ){
            return;
        }
        //否则让氮气增加相应的数量
        nAmount += p_amout;
    }
}

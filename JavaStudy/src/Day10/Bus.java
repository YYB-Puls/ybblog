package Day10;

public class Bus {
    //汽车速度
    public int speed;
    //汽车名字
    public String name;
    //汽车颜色
    public String color;
    //专门为公共汽车增加的3个属性
    public boolean isBus;
    //最大乘客数
    public int max_Passenger = 35;
    //当前乘客数
    public int current_Passenger = 0;



    //汽车提速的方法,参数是汽车需要添加的速度
    public void speedUp(int p_speed){
        if (p_speed > 0){
            speed += p_speed;
        }
    }
    //汽车减速的方法,参数是汽车需要减少的速度
    public void slowDown(int p_speed){
        //如果p_speed大于0,则计算新的速度
        if (p_speed > 0){
            int tempSpeed =speed - p_speed;
            //如果新的速度大于0,则给汽车减少相应的速度
            if (tempSpeed >= 0){
                speed = tempSpeed;
            }
        }
    }
    //专门为公共汽车添加的方法,完成旅客上车的功能
    public boolean getOneBus(int p_amout){
        //参数为需要上车的乘客数,如果是Bus
        if (isBus){
            //计算新的乘客数,保存在temp变量中
            int temp = p_amout + current_Passenger;
            //如果temp值小于或等于最大乘客数
            if (temp <= max_Passenger){
                current_Passenger = temp;
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
    //专门为公共汽车添加的方法,完成旅客下车的功能
    public boolean getDownBus(int p_amout){
        if (isBus){
            int temp = current_Passenger - p_amout;

            if (max_Passenger <= 0){
                return false;
            }else {
                current_Passenger = temp;
                return true;
            }
        }
        return false;
    }
}

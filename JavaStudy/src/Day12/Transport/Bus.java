package Day12.Transport;

public class Bus extends CarBase {
    //专门为公共汽车增加的3个属性
    public boolean isBus = true;
    //最大乘客数
    public int max_Passenger = 35;
    //当前乘客数
    public int current_Passenger = 0;
    public int max_slow = 27;

    public Bus(){
        super();
        System.out.println("Bus类的构造方法被调用了");
    }

    public void slowDown(int p_speed){
        System.out.println("Bus类中定义的slowDown(int)方法被调用了");
        if (p_speed > max_slow){
            p_speed = max_slow;
        }
        if (p_speed > 0){
            int tempSpeed = speed - p_speed;
            if (tempSpeed > 0){
                speed  = tempSpeed;
            }
        }
    }

    public Bus(String color,  String name, int speed,int max_Passenger, int current_Passenger){
        super(color ,  name ,speed);
        this.max_Passenger = max_Passenger;
        this.current_Passenger = current_Passenger;
        System.out.println("Bus类的有参构造方法被调用了");
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

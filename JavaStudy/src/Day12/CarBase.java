package Day12;

public class CarBase {
    //汽车速度
    public int speed ;
    //汽车名字
    public String name;
    //汽车颜色
    public String color;
    //最大速度限制
    /*public TransportStatus getCarStatus(){
        TransportStatus carStatus = new TransportStatus(name, speed);
        return carStatus;
    }*/
    public CarStatus getCarStatus(){
        CarStatus carStatus = new CarStatus(name,speed);
        return carStatus;
    }
    public int getSpeed(){
        return speed;
    }

    public String getName(){
        return name;
    }

    public int maxSpeed = 90;

    public CarBase(){
        System.out.println("CarBus类的构造方法被调用了");
    }

    public CarBase(String color,  String name, int speed){
        this.speed = speed;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.name = name;
        System.out.println("CarBus类的有参构造方法被调用了");
    }

    public void followSpeed(CarBase car){
        String className = this.getClass().getName();
        System.out.println("调用者的类型为:"+className);
        int newSpeed = car.speed;
        if (newSpeed > speed){
            speedUp(newSpeed - this.speed);
        }else {
            slowDown(this.speed - newSpeed);
        }
    }

    //给汽车加速的方法
    public void speedUp(int p_speed){
        System.out.println("CarBase类中定义的SpeedUp(int)方法被调用了");
        int tempSpeed = 0;
        if (p_speed > 0){
            tempSpeed = speed + p_speed;
        }
        if (tempSpeed <= maxSpeed){
            speed = tempSpeed;
        }
    }
    //给汽车减速的方法
    public void slowDown(int p_speed){
        System.out.println("CarBase类中定义的slowDown(int)方法被调用了");
        //如果p_speed大于0,则计算新的速度
        if (p_speed > 0){
            int tempSpeed =speed - p_speed;
            //如果新的速度大于0,则给汽车减少相应的速度
            if (tempSpeed >= 0){
                speed = tempSpeed;
            }
        }
    }


}

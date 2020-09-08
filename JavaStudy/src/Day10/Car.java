package Day10;

public class Car {
    //汽车速度
    public int speed ;
    //汽车名字
    public String name;
    //汽车颜色
    public String color;
    //最大速度限制
    public int maxSpeed = 90;

    public Car (){
        System.out.println("Car类的无参构造方法被调用了");
    }


    public Car(String color ,int maxSpeed , String name , int speed , int amout){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.speed = speed;
        System.out.println("Car类的有参构造方法被调用了");
    }

    public void followSpeed(Car car){
        int newSpeed = car.speed;
        if (newSpeed > speed){
            speedUp(newSpeed - this.speed);
        }else {
            slowDown(this.speed - newSpeed);
        }
    }

    //给汽车加速的方法
    public void speedUp(int p_speed){
        int tempSpeed = 0;
        if (p_speed > 0){
            tempSpeed = speed + p_speed;
        }
        //增加了判断速度是否超过最大
        if (tempSpeed <= maxSpeed){
            //速度限制代码;
            speed = tempSpeed;
        }
    }
    //给汽车减速的方法
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

}

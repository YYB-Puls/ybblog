package Day09;

public class Car {
    int speed;
    String color;
    String name;
    String direaction;
    boolean isTrafficAdmin;

    public Car(){
       this("java护航者","咖啡豆色",false);
    }
    public Car(String p_name,String p_color){
        this(p_name,p_color,false);
    }
    public Car(String p_name,String p_color,boolean p_trafficAdmin){
        this.name = p_name;
        this.color = p_color;
        this.isTrafficAdmin = p_trafficAdmin;
    }

    public void driveCar(){
        speed = 50;
        direaction = "南方";

    }
    public void raiseSpeed (int p_speed){
        if (p_speed < 0){
            System.out.println("p_speed的值小于0,raiseSpeed()方法将结束!");
        }
        int currentSpeed = speed + p_speed;
        speed = currentSpeed;

    }
    public void raiseSpeed(byte p_speed){
        if (p_speed < 0){
            System.out.println("p_speed的值小于0,raiseSpeed()方法将结束!");
        }
        int currentSpeed = speed + p_speed;
        speed = currentSpeed;
    }

    public void setSpeedAndDirection(int p_speed,String p_direction){
        speed = p_speed;
        direaction = p_direction;

    }

    public boolean isOverSpeed(){
        if (speed > 80){
            return true;
        }else {
            return  false;
        }

    }

    public void overtakeCar(Car anotherCar){
        speed = anotherCar.speed + 5;
        direaction = anotherCar.direaction;
    }

    public void setNameForAnotherCar(Car anotherCar , String newName){
        if (!isTrafficAdmin){
            System.out.println("你不是交通管理员,无权调用方法");
            return;
        }
        anotherCar.name = newName;
    }

    public void stopAnotherCar(Car anotherCar){
        if (!isTrafficAdmin){
            System.out.println("你不是交通管理员,无权调用方法");
            return;
        }
        anotherCar.speed = 0;
    }

    public CarStatus getAnotherCarStatus(Car anotherCar){
        if (!isTrafficAdmin){
            anotherCar.speed = 0;
        }
        CarStatus status = new CarStatus(anotherCar.speed,anotherCar.direaction);
        return status;
    }

    public boolean isLegalCarStatus(CarStatus status){
        if (status.speed <= 80){
            return true;
        }else {
            return false;
        }
    }

    public void setSpeed(int p_speed){
        if (p_speed < 0){
            System.out.println("汽车速度不能为负值,方法将退出.");
            return;
        }
        this.speed = p_speed;
    }

    public void printCarRunningMessage(){
        System.out.println("汽车名字:"+this.name+",汽车的颜色是"+this.color+",车速是:"+this.speed+",行驶方向是"+this.direaction);
    }
}

package Day10;

public class Car {
    //汽车速度
    public int speed;
    //汽车名字
    public String name;
    //汽车颜色
    public String color;


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

}

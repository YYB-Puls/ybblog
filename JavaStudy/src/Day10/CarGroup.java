package Day10;

public class CarGroup {
    //领车队
    public CarBase leadingCar;
    //随车队
    public CarBase[] followingCars;

    public CarGroup(CarBase leadingCar, CarBase[] followingCars){
        this.leadingCar = leadingCar;
        this.followingCars = followingCars;
    }

    public void speedUp(int p_speed){
        leadingCar.speedUp(p_speed);
        for (int i = 0; i < followingCars.length; i++){
            followingCars[i].followSpeed(leadingCar);
        }
    }
    public void slowDown(int p_speed){
        leadingCar.slowDown(p_speed);
        for (int i = 0; i < followingCars.length; i++){
            followingCars[i].followSpeed(leadingCar);
        }
    }
}

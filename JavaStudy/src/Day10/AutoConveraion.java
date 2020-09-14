package Day10;

public class AutoConveraion {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        CarBase carBase = sportsCar;
        carBase.speedUp(70);
        System.out.println("CarBase.speed的值为:"+carBase.speed);
        System.out.println("SportsCar.speed的值为:"+sportsCar.speed);
        sportsCar.speedUpUsingN(77);
        System.out.println("CarBase.speed的值为:"+carBase.speed);
        System.out.println("SportsCar.speed的值为:"+sportsCar.speed);
    }
}

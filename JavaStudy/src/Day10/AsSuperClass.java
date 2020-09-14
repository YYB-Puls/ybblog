package Day10;

public class AsSuperClass {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        CarBase car = sportsCar;

        sportsCar.addN(30);
        ((SportsCar) car).addN(11);
    }


}

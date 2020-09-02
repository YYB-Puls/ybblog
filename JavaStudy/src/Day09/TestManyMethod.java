package Day09;

public class TestManyMethod {
    public static void main(String[] args) {
        Car normalCar = new Car("普通车","白色");
        normalCar.setSpeedAndDirection(55, "菜市场");
        normalCar.printCarRunningMessage();

        Car carzyCar = new Car("疯狂赛车","黑色");
        carzyCar.setSpeedAndDirection(35, "赛车场");
        carzyCar.printCarRunningMessage();
        carzyCar.overtakeCar(normalCar);
        carzyCar.printCarRunningMessage();
        carzyCar.raiseSpeed((byte) 50);
        carzyCar.printCarRunningMessage();
        carzyCar.raiseSpeed((byte) 55);

        Car tarfficAdmin = new Car("汽车管理员","红色",true);
        tarfficAdmin.setSpeedAndDirection(55, "交通管理中心");
        CarStatus normalStatus = tarfficAdmin.getAnotherCarStatus(normalCar);
        boolean isLegal = tarfficAdmin.isLegalCarStatus(normalStatus);
        if (isLegal){
            tarfficAdmin.setNameForAnotherCar(normalCar, "驾车典范");

        }
        normalCar.printCarRunningMessage();

        CarStatus crazyStatus = tarfficAdmin.getAnotherCarStatus(carzyCar);
        isLegal = tarfficAdmin.isLegalCarStatus(crazyStatus);
        carzyCar.stopAnotherCar(tarfficAdmin);

        if (!isLegal){
            tarfficAdmin.setNameForAnotherCar(carzyCar, "疯狂超速车");
            tarfficAdmin.stopAnotherCar(carzyCar);
            carzyCar.printCarRunningMessage();
        }
        normalCar.setSpeed(0);
        normalCar.printCarRunningMessage();
    }
}

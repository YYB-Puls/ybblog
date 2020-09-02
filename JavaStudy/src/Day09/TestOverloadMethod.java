package Day09;

public class TestOverloadMethod {
    public static void main(String[] args) {
        CarOverload carol = new CarOverload();
        /*carol.raiseSpeed(9999);
        System.out.println("调用签名为raiseSpeed(int)的加速方法,现在车速为:"+carol.speed);
        carol.speed = 0;
        carol.raiseSpeed(999999, 88);
        System.out.println("现在的车速为:"+carol.speed);*/

        int speed = 99;
        carol.raiseSpeed( speed);

    }
}

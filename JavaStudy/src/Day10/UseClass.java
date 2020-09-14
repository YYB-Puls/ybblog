package Day10;

public class UseClass {
    public static void main(String[] args) {
        CarBase car = new CarBase();
        Class clazz = car.getClass();

        System.out.println("car引用指向的对象所属的类是:"+clazz.getName());
    }
}

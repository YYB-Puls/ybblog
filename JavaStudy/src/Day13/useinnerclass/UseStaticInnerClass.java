package Day13.useinnerclass;

import Day13.innerclass.UseInnerClassOutside;

public class UseStaticInnerClass {
    public static void main(String[] args) {
        UseInnerClassOutside.StaticInnerClass inner = new UseInnerClassOutside.StaticInnerClass();
        System.out.println("内部类方法返回值:"+ inner.getVariable());
    }
}

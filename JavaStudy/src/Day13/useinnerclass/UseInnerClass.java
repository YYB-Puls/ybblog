package Day13.useinnerclass;

import Day13.innerclass.OutClass;
import Day13.innerclass.UseInnerClassOutside;
import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class UseInnerClass {
    public static void main(String[] args){
        UseInnerClassOutside out = new UseInnerClassOutside();
        UseInnerClassOutside.InnerClass inner = out.new InnerClass();
        System.out.println("内部类方法返回值:"+ inner.getVariable());

    }
}

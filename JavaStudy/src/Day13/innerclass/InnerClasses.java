package Day13.innerclass;

public class InnerClasses {
    class Inner{
        public int variable;
    }
    static  class StaticInner{
        public static int useInner(){
            InnerClasses out = new InnerClasses();
            Inner inner = out.new Inner();
            //通过inner引用访问非静态内部类对象的成员变量
            return inner.variable;
        }
    }
}

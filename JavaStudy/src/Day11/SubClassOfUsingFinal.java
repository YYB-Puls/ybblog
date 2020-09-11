package Day11;

public class SubClassOfUsingFinal extends  UsingFinalInMethod {
    public final void finalMethod(){
        System.out.println("尝试覆盖父类中的final方法");
    }
    public void commonMethod(){
        System.out.println("覆盖父类中的普通方法");
    }
}

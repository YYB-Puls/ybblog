package Day13.useinnerclass;

import Day13.innerclass.UseMembers;

public class RefToOut {
    public static void main(String[] args) {
        UseMembers out = new UseMembers();
        UseMembers.InnerVaribaleClass inner = out.new InnerVaribaleClass();
        System.out.println("内部类方法返回值:"+inner.useOutVariable());
    }
}

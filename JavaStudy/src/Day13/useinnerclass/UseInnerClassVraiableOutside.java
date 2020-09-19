package Day13.useinnerclass;

import Day13.innerclass.UserInnerVariable;

public class UseInnerClassVraiableOutside {
    public static void main(String[] args){
        UserInnerVariable out = new UserInnerVariable();
        UserInnerVariable.InnerClass inner = out.new InnerClass();
        //在类的外部不能使用private修饰的变量
       // int a = inner.variable
    }
}

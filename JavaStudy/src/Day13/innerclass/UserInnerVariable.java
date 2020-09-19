package Day13.innerclass;

public class UserInnerVariable {
    public class InnerClass {
        private int variable = 5;
    }
    public int useVariableOfInner(){
        InnerClass inner = new InnerClass();
        return inner.variable;
    }
}

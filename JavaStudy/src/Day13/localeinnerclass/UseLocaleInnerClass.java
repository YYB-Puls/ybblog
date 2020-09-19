package Day13.localeinnerclass;

public class UseLocaleInnerClass {
    public void method(){
        class UserInner{
            private  int variable = 9;
            public int getVariable(){
                return variable;
            }
        }
        UserInner inner = new UserInner();
        inner.getVariable();
    }
}

package Day13.innerclass;

import Exercises.Topice08.C;

public class ClassInMethod {
    public int variable;
    public ClassInMethod(){
        class InnerClassInConstructMethod{
            public int variable;
            public InnerClassInConstructMethod(){

            }
            public int getVariable(){
                return variable;
            }
        }
        //内部类InnerCLassInConstructMethod的代码结束
    }
    public int getVariable(){
        class InnerClassInMethod{
            public int variable;
            public InnerClassInMethod(){

            }
            public int getVariable(){
                return variable;
            }
        }
        return variable;
    }


}

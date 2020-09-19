package Day13.innerclass;

public class UseMembers {
    private int variableInOutClass = 5;

    public class InnerVaribaleClass{
        private int variableInInnerClass ;
        public int useOutVariable(){
            /*return variableInInnerClass + variableInOutClass;*/
            return variableInInnerClass + UseMembers.this.variableInOutClass;
        }
    }
    public void useInnerClassInstance(){
        InnerVaribaleClass inner = new InnerVaribaleClass();
        inner.useOutVariable();
        System.out.println("内部类中的privaate变量:"+inner.variableInInnerClass);
    }
}

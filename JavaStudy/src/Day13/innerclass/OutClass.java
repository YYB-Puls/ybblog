package Day13.innerclass;

public class OutClass {
    private int varibale = 9;

    public OutClass(){

    }

    public int getVaribale(){
        return varibale;
    }

    public class InnerClass{
        public InnerClass(){

        }
        private int innerVariable;
        public int getInnerVariable(){
            return innerVariable;
        }
    }
    public int useInnerClass(){
        InnerClass inner = new InnerClass();
        int valueFromInner = inner.getInnerVariable();
        return valueFromInner;
    }
}


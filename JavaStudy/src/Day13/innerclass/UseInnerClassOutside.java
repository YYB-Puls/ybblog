package Day13.innerclass;

public class UseInnerClassOutside {
    private int variable = 6;
    public int getVariable(){
        return variable;
    }
    public class InnerClass{
        private int variable = 5;
        public int getVariable(){
            return variable;
        }
    }

    public static class StaticInnerClass{
        private int variable = 5;
        public int getVariable(){
            return variable;
        }

    }
}

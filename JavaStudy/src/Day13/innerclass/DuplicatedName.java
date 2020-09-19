package Day13.innerclass;

public class DuplicatedName {
    private int variable = 5;
    class InnerClass{
        private int variable = 7;
        public int useOutVariable(){
            return variable + DuplicatedName.this.variable;
        }
    }

}

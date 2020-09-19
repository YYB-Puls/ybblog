package Day13.learnabstractclass;

public class Schoolmaster extends Person{
    public Schoolmaster(String name){
        super(name);
    }

    @Override
    public void introduceSelf() {
        System.out.println("大家好,我是本校校长,我的名字叫"+getName());
    }
}

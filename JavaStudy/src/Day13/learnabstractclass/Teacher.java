package Day13.learnabstractclass;

public class Teacher extends Person {
    public Teacher(String name){
        super(name);
    }

    @Override
    public void introduceSelf() {
        System.out.println("学生们好,我是一名老师,我的名字"+getName());
    }
}

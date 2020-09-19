package Day13.learnabstractclass;

public class Student extends Person {
    public Student(String name){
        super(name);
    }

    @Override
    public void introduceSelf() {
        System.out.println("大家好,我是一名学生,我的名字叫"+getName());
    }
}

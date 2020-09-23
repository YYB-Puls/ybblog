package Day17.genericstypes;

import Day17.compare.Student;

import java.util.ArrayList;
import java.util.List;

public class NoGenericsTypes {
    public static void main(String[] args) {

        Student stu = new Student("刘伟",1 );
        List<Student> students = new ArrayList<Student>();
        students.add(stu);
        Student stuFromList = students.get(0);
        printStudentProps(stuFromList);

        /*Student student = new Student("刘伟",1 );
        List students = new ArrayList();
        students.add(student);
        Student stuFromList =(Student) students.get(0);
        printStudentProps(stuFromList);*/
    }

    public static void printStudentProps(Student stu){
        System.out.println("学生姓名:"+stu.getName());
        System.out.println("学生编号:"+stu.getNumber());
    }
}

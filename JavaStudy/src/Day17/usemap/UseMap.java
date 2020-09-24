package Day17.usemap;

import Day17.compare.Student;
import Day17.genericstypes.NoGenericsTypes;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        Map students = new HashMap();
        Student stu1 = new Student("刘伟",1 );
        Student stu2 = new Student("成秋",2 );
        students.put(stu1.getName(),stu1 );
        students.put(stu2.getName(), stu2);
        String stuName = "成秋";
        Student findstu = (Student) students.get(stuName);
        NoGenericsTypes.printStudentProps(findstu);
    }
}

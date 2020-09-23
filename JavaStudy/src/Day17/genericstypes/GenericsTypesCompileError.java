package Day17.genericstypes;

import Day17.compare.Student;

import java.util.ArrayList;
import java.util.List;

public class GenericsTypesCompileError {
    public void test(){
        List<Student> stuList = new ArrayList<Student>();
        String str = "str";
        //stuList.add(str);
    }
}

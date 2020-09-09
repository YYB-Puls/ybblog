package Exercises.Topice08;
/**
 * 习题1:
 * 假设包com.exercises中有3个类A,B和C
 * 给出引入类A的import语句和同时引入
 * A,B,C这3个类的import语句
 *
 * 习题2:假设在第一题的基础上,如果com.exercises.subpackage中有D和E两个类,
 * 那么下面的语句会不会引入E类和D类?
 *
 * import com.exercises.*
 *
 * 答案:会
 *
 *
 */

import Exercises.Topice08.A;
import Exercises.Topice08.B;
import Exercises.Topice08.C;

public class A {
    /**
     * 给下面的类添加符合javadoc格式的注释,给类中的变量添加单行注释,
     * 给类中的方法添加多行注释
     */

    //单行注释
    private int variable ;

    /**
     * 多行注释
     */
    public void method(){}
}

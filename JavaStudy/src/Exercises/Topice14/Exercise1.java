package Exercises.Topice14;

/**
 * 使用两种不同的方式,纠正下面代码中异常处理中出现的语法错误
 */
public class Exercise1 {
    /*public static void method() throws Exception{
        throw new Exception();
    }*/

    public static void method() {
        try {
            throw new Exception();
        }catch (Exception e){
            System.out.println("异常结束");
        }

    }
}

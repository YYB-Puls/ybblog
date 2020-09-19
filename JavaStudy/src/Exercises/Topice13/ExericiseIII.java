package Exercises.Topice13;
//然后添加编写一个叫做ExericiseIII的类
public class ExericiseIII {
    // 添加一个method()方法
    public void method(){
        //然后在其中使用IExercise接口
        //添加一个匿名内部类
        IExericise iExericise = new IExericise() {
            @Override
            public void method() {

            }
        };
    }



}

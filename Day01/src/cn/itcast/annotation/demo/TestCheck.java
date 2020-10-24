package cn.itcast.annotation.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) throws IOException {
        Calulator calulator = new Calulator();
        Class aClass = calulator.getClass();
        Method[] methods = aClass.getMethods();

        int number = 0 ;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class) ){
                try {
                    method.invoke(calulator);
                }catch (Exception e){
                    number++;
                    bw.write(method.getName()+"方法异常");
                    bw.newLine();
                    bw.write("异常名称:"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因:"+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("----------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现了"+number+"异常");
        bw.flush();
        bw.close();
    }
}

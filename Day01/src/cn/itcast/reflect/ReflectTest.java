package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        properties.load(resourceAsStream);

        String clssNmae = properties.getProperty("classNmae");
        String methodName = properties.getProperty("methodName");

        Class aClass = Class.forName(clssNmae);
        Object obj = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(obj);

    }
}

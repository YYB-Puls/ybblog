package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Method eat = personClass.getMethod("eat");
        Person person = new Person();
        eat.invoke(person);

        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(person, "饭");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }

    }
}

package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;


        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);


    }
}

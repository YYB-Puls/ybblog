package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Class aClass = p.getClass();
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("..........................");
        Field a = aClass.getField("a");
        Object value = a.get(p);
        System.out.println(value);

        a.set(p, "张三");
        System.out.println(p);


        System.out.println("=======================");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        System.out.println(".............");
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        Object value2 = name.get(p);
        System.out.println(value2);

        name.set(p, "李四");
        System.out.println(p);
    }
}

package cn.itcast.reflect;

import cn.itcast.domain.Person;

public class ReflectDemo1 {

    public static void main(String[] args) throws Exception {
        //class.forName("全类名")
        Class cls1 = Class.forName("cn.itcast.domain.Person");
        System.out.println(cls1);
        //类名.Class
        Class cls2 = Person.class;
        System.out.println(cls2);
        //对象.getClass
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);

    }
}

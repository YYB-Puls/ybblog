package Exercises.Topice06;

/**
 * 使用第二题中添加的方法创建book类的对象,然后给Book类的属性赋值,
 * 最后将属性值输出到控制台
 *
 * todo 习题三去哪里了？
 * 习题3:
 * 理解对象和引用之间的关系:编写一个程序,使用第1题中的book类
 * 首先创建一个book类的对象,然后创建book1和book2两个book类的引用,
 * 让它们都指向创建出的book类,通过这两个引用修改book对象的属性,
 * 最后将book对象的属性值输出到控制台
 */

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Java工程师",99999,50.0);
        book.pring();

        book.setBookName("斗罗大陆");
        book.pring();


    }


}

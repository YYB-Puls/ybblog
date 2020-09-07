package Exercises.Topice06;

/**
 * 使用第二题中添加的方法创建book类的对象,然后给Book类的属性赋值,
 * 最后将属性值输出到控制台
 *
 * todo 习题三去哪里了？
 */

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Java工程师",99999,50.0);
        book.pring();

        book.setBookName("斗罗大陆");
        book.pring();
    }


}

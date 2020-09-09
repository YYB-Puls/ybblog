package Exercises.Topice06;

/**
 * 习题3:
 *  * 理解对象和引用之间的关系:编写一个程序,使用第1题中的book类
 *  * 首先创建一个book类的对象,然后创建book1和book2两个book类的引用,
 *  * 让它们都指向创建出的book类,通过这两个引用修改book对象的属性,
 *  * 最后将book对象的属性值输出到控制台
 */
public class TestBook2 {
    public static void main(String[] args) {
        Book book1 = new Book("高级工程师",99999,80.6);
        Book book2 = new Book("初级工程师",666666,60.6);
        book1.pring();
        book2.pring();
    }
}

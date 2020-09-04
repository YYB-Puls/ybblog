package Exercises.Topice06;

/**
 * 2.使用第一题中的book类,首先创建一个book类的对象,然后并给类中的三个属性赋值,
 * 最后将Book类对象的三个属性值输出到控制台
 */
public class BookImpl {
    public static void main(String[] args) {
        Book b = new Book();
        b.bookName = "三体";
        b.pageCount = 9999;
        b.price = 80.3;

        System.out.println("书名:"+b.bookName+",页数:"+b.pageCount+",价格:"+b.price);

    }


}

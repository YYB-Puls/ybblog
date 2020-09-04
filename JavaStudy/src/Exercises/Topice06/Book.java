package Exercises.Topice06;

/**
 * 创建一个Book类,用来代表一本书,类中有三个属性,分别是String类型的BookName,int类型的PageCount,double类型的price
 */
public class Book {
    String bookName;
    int pageCount ;
    double price;

    /**
     * 习题七.给book类添加两个构造方法,一个构造方法不接受任何参数,给3个属性赋初始值;另一个构造方法有三个参数,分别
     * 用来给3个属性值赋值
     */
    public Book(){
        this.bookName = "斗罗大陆";
        this.pageCount = 9999;
        this.price = 8.00;
    }
    public Book(String bookName,int pageCount,double price){
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.price = price;
    }

    /**
     * 扩展第6章习题中的book类,给类中每个属性添加得到属性和设置属性值的方法.比如,对于
     * bookName()方法,应该添加一个getbookName()方法,用来返回bookName属性的值;还要添加一个
     * setbookName()方法,用来设置bookName属性的值
     */
    public void getBookName(){
        System.out.println("书名:"+bookName);
    }

    public void setBookName(String b_bookName){
        this.bookName = b_bookName;
    }

    public void pring(){
        System.out.println("书名:"+bookName+",页数:"+pageCount+",价格:"+price);
    }
}

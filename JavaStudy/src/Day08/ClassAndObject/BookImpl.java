package Day08.ClassAndObject;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        book.bookName = "三体";
        book.pageCount = 123022;
        book.price = 100.0;

        System.out.println("书名:"+book.bookName+",页数"+book.pageCount+",价格是:"+book.price);
    }
}

package Day09;

public class Book {
    String bookName;
    int pageCount ;
    double price;

    public Book(){
        this.bookName = "三体";
        this.pageCount = 9992;
        this.price = 123.0;
    }

    public Book(String b_bookName,int b_pageCount,double b_price){
        this.bookName = b_bookName;
        this.pageCount = b_pageCount;
        this.price = b_price;
    }
}

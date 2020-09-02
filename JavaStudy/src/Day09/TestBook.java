package Day09;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Java工程师",99999,50.0);
        book.pring();

        book.setBookName("斗罗大陆");
        book.pring();
    }


}

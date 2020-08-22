package Day04;

public class AssignArray {
    public static void main(String[] args) {
        int[] book = new  int[3];
        book[2] = 3;

        System.out.println("book的长度为:"+book.length+".book[2]:"+book[2]);
        book = new int[32];
        System.out.println("book的长度为:"+book.length+".book[2]:"+book[2]);
    }
}

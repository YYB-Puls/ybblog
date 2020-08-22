package Day04;

public class IndexOutOfBoundExmple {
    public static void main(String[] args) {
        int[] array = {10,20,30};
        
        System.out.println(array[array.length-1]);
    }
}

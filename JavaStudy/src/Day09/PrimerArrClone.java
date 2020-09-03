package Day09;

public class PrimerArrClone {
    public static void main(String[] args) {
        int[] arr = {7,8,9};
        int[] clonedArr = arr.clone();
        arr[2] = 777;
        clonedArr[2] = 888;
        System.out.println("arr的第三个元素是:"+arr[2]+",clonedArr的第三个元素是:"+clonedArr[2]);
    }
}

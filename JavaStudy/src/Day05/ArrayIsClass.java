package Day05;

import com.sun.javafx.sg.prism.web.NGWebView;

public class ArrayIsClass {
    public static void main(String[] args) {
        int[] intArr;
        intArr = new int[1];
        intArr = new int[2];

        //这个数组的元素就是二维的double数组,即double[][]
        double[][][] double3DArray;
        int[] a1 = new int[9];
        int[] a2 = new  int[0];
        a2 = a1;
        System.out.println("a2.length="+ a2.length);

        double[] a3 = new double[5];
    }
}

public class ArrayExercise01 {
    public static void main(String[] args) {
        test01();
    }

    static void test01() {
        //1. 创建一个大小为4*10的二维数组，并使用变量arr1指向它；
        int[][] arr1 = new int[4][10];
        //2. 创建引用arr2也指向这个数组；
        int[][] arr2 = arr1;
        //3. 使用while循环打印arr2的值（矩阵形式）；
        printArr(arr2);
        //4. 修改arr1指向的数组的第一维数据均填充为8；
        chmodArr1Data(arr1);
        //5.  使用while循环打印arr2的值（矩阵形式）；
        printArr(arr2);
        //6. 修改arr2指向的数组的第二维数据均填充为2；
        chmodArr2Data(arr2);
        //7. 使用for循环打印arr2的值（矩阵形式）
        printArrInFor(arr1);
    }

    private static void chmodArr2Data(int[][] arr2) {
        for (int j = 0; j < arr2[0].length; j++) {
            arr2[0][j] = 2;
        }
    }

    private static void chmodArr1Data(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i][0] = 8;
        }
    }

    private static void printArr(int[][] arr) {
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + ",");
                j++;
            }
            System.out.println("");
            i++;
        }
        System.out.println("");
    }

    private static void printArrInFor(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + ",");
            }
            System.out.println("");
        }
    }
}

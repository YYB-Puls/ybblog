

public class ArrayExercise {
    /**
     * 1. 创建一个大小为4*10的二维数组，并使用变量arr1指向它；
     * 2. 创建引用arr2也指向这个数组；
     * 3. 使用while循环打印arr2的值（矩阵形式）；
     * 4. 修改arr1指向的数组的第一维数据均填充为8；
     * 5.  使用while循环打印arr2的值（矩阵形式）；
     * 6. 修改arr2指向的数组的第二维数据均填充为2；
     * 7. 使用for循环打印arr2的值（矩阵形式）；
     *
     * 要求，不使用if语句；
     */
    public static void main(String[] args) {
        //1. 创建一个大小为4*10的二维数组，并使用变量arr1指向它；
        int[][] arr1 = new int[4][10];
        // 2. 创建引用arr2也指向这个数组；
        int[][] arr2 = arr1;
        //3. 使用while循环打印arr2的值（矩阵形式）；
        print(arr1);
        //4. 修改arr1指向的数组的第一维数据均填充为8；
        setvalue1(arr2);
        //5.  使用while循环打印arr2的值（矩阵形式）；
        print(arr1);
        //6. 修改arr2指向的数组的第二维数据均填充为2；
        setvalue2(arr2);
        //7. 使用for循环打印arr2的值（矩阵形式）；
        printFor(arr2);
    }
    public static void print(int[][] arr1){
        int i = 0;
        while (i < arr1.length){
            int j = 0;
            while (j < arr1[i].length){
                System.out.print(arr1[i][j]+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }

    public static void setvalue1(int[][] arr2){
        for (int i = 0; i < arr2.length; i++){
            arr2[i][0] = 8;
        }
    }
    public static void setvalue2(int[][] arr2){
        for (int i = 0; i < arr2[0].length; i++){
            arr2[0][i] = 2;
        }
    }
    public static void printFor(int[][] arr2){
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

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
        int[][] arr1 = new int[4][10];
        int[][] arr2 = arr1;
        int i = 0;
        int j = 0;
        while (i < arr2.length){
            j = 0;
            while (j < arr2[i].length){
                System.out.print(arr2[i][j]+",");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("=================================");

        i = 0;
        while (i< arr2.length){
            arr2[i][0] = 8;
            j = 0;
            while (j < arr2[i].length){
                System.out.print(arr2[i][j]+",");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("=================================");

        for (int c = 0; c < arr2.length; c++){
            for (int d =0 ; d < arr2[c].length; d++){
                arr2[c][0] = 8;
                arr2[0][d] = 2;
                System.out.print(arr2[c][d]+",");
            }
            System.out.println();
        }


    }
}

package Day08;

public class YangHui {
    public static void main(String[] args) {
        //程序生成的杨辉三角的层数
        int levelCount = 10;
        //数组的第二维的大小为0,所以每个数组中没有任何int元素
        int[][] yangHui = new int[levelCount][0];
        //创建一个二维数组用来保存杨辉三角的值
        //使用for循环为杨辉三角的每一层创建一个int数组
        for (int i = 0; i < levelCount; i++){
            //没次循环生成一行杨辉三角
            yangHui[i] = new int[i+1];
            for (int j = 0; j <= i; j ++){
                if (i == 0){
                    yangHui[i][j] = 1;
                }else {
                    int value = 0;
                    if (j >= 1){
                        value += yangHui[i-1][j-1];
                    }
                    if (j < i){
                        value += yangHui[i - 1][j];
                    }
                    yangHui[i][j] = value;
                }
            }
        }

        /*for (int i = 0; i < levelCount; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(yangHui[i][j]+"\t");
            }
            System.out.println();
        }*/
        for (int i = 0; i < levelCount; i++){
            for (int j = 0; j < levelCount - i - 1; j++){
                System.out.print("\t");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(yangHui[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}

package Exercises.Topice05;

/**
 * 编写一个给二维数组中所有元素赋初始值的程序:创建一个二维的int数组,第一个大小为10,第二维大小为2
 * 给这个数组中的元素赋值为1,最后使用循环语句将数组内容输出到控制台
 *
 */
public class Demo02 {
    public static void main(String[] args) {

        int[][] ShuZu = new int[10][2];
        for (int i = 0; i < ShuZu.length; i++){
            for (int j = 0; j < 2; j++){
                if (ShuZu[i][j] == ShuZu[i][0] ){
                    ShuZu[i][j] = 1;
                }
                if (ShuZu[i][j] == ShuZu[i][1]){
                    ShuZu[i][j] = 1;
                }
                System.out.print(ShuZu[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

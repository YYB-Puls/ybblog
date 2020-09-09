package Exercises.Topice05;

/**
 * 在上一题中,使用两个引用指向这个数组,要求使用第一个引用将第2维中索引为0的10个元素赋值为1,使用第二个引用将第2维
 * 中索引为1的10个元素赋值为2,最后使用循环语句将数组内容输出到控制台,根据输出结果,理解两个引用操作是同一个数组
 *
 */
public class Demo03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int[][] ShuZu = new int[a][b];
        // todo 使用两个引用而不是一个引用，注意审题
        for (int i = 0; i < ShuZu.length; i++){
            for (int j = 0; j < b; j++){
                if (ShuZu[i][j] == ShuZu[i][0] ){
                    ShuZu[i][j] = 1;
                }
                if (ShuZu[i][j] == ShuZu[i][1]){
                    ShuZu[i][j] = 2;
                }
                System.out.print(ShuZu[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

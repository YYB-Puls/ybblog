package Exercises.Topice04;

/**
 * 2.使用嵌套的for语句循环,在控制台上输出如下内容
 * 图片见习题2.jpg
 */
public class Demo02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){

            for (int j = 1; j <= 9; j++){
                System.out.print(j*i+"\t");
            }
            System.out.println();
        }
    }
}

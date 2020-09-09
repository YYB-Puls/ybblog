package Exercises.Topice04;

/**
 * 使用while语句循环与上一题相同的功能
 */
public class Demo03 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 81){
            System.out.print(i+"\t");
            // todo 表达式太长，请使用while精简
           if (i % 9 == 0){
               System.out.println();
           }
            i ++;
        }
    }
}

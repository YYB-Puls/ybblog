package Exercises.Topice04;

/**
 * 使用while语句循环与上一题相同的功能
 */
public class Demo03 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9){
            System.out.print(i+"\t");
            // todo 请精简
            System.out.println(2*i+"\t"+3*i+"\t"+4*i+"\t"+5*i+"\t"+6*i+"\t"+7*i+"\t"+8*i+"\t"+9*i);
            i ++;
        }
    }
}

package Exercises.Topice05;

/**
 * 1.编写一个给数组中所有元素赋初始值的程序:创建一个包含21元素的int数组,
 * 然后使用循环语句,让数组元素的值为其数组下标的值
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] ShuZu = new int[21];
        for (int i = 0; i < ShuZu.length; i++){
            ShuZu[i] = i;
            System.out.println(ShuZu[i]);
        }
    }
}

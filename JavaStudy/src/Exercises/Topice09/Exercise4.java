package Exercises.Topice09;

import java.util.Scanner;

/**
 * 编写一个拼接字符串的程序,首先程序中有一个静态方法appendTwoString()
 * 它使用StringBuffer类将两个String对象拼接起来,返回String类型的运算结果
 * 程序命令行给程序传递两个参数,然后使用appendTwoString()方法将两个参数拼接起来
 * 最后将结果输出到控制台
 */
public class Exercise4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一串字符:");
        String string1 = scanner.next();
        System.out.println("输入第二串字符:");
        String string2 = scanner.next();
        appendTwoString(string1, string2);
    }
    public static void   appendTwoString(String string1,String string2){
        StringBuffer string = new StringBuffer();
        string.append(string1);
        string.append(string2);
        String str = string.toString();
        System.out.println(str);
    }
}

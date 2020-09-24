package Day17.learnchar;

public class PrintCharCoder {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("程序没有参数");
            return;
        }
        if (args[0].length() == 0){
            System.out.println("字符串为空");
            return;
        }
        char ch = args[0].charAt(0);
        int value = ch;
        System.out.println("字符\'"+ch+"\'对应的编码是:"+value);
    }
}

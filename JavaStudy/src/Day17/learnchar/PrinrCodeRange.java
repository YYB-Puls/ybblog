package Day17.learnchar;

public class PrinrCodeRange {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("程序需要两个参数");
            return;
        }
        int begin = 0;
        int end = 0;
        try {
            begin = Integer.valueOf(args[0]);
            end = Integer.valueOf(args[1]);

        }catch (NumberFormatException ex){
            System.out.println("程序需要两个整数做参数");
            return;
        }
        for (int i = begin; i < end; i++){
            char ch = (char) i;
            System.out.println(ch);
        }
    }
}

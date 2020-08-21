package Day03;


public class IfElseNest {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        int c = 99;
        if (a == b && a == c){
            System.out.println("a,b,c都相等");
        }else {
            if (a == b) {
                System.out.println("a=b");
            }
            if (b==c){
                System.out.println("b=c");
            }
            if (a>b){
                System.out.println("a>b");
            }else {
                if (a<b){
                    System.out.println("a<b");
                }else {
                    System.out.println("都不相等");
                }
            }
        }
    }
}

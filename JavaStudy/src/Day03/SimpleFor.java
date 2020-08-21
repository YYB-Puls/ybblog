package Day03;

public class SimpleFor {
    public static void main(String[] args) {
        char ch = 'A';
        int starNum = ch;
        for (int i = 0; i < 26; i++) {
            System.out.println((starNum + i) +"\t"+(char) (starNum + i));
        }
    }
}

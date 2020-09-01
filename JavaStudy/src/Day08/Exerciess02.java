package Day08;

public class Exerciess02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int[][] ShuZu = new int[a][b];
        for (int i = 0; i < ShuZu.length; i++){
            for (int j = 0; j < b; j++){
                ShuZu[i][j] = 1;
                System.out.print(ShuZu[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

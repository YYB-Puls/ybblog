package Day08;

public class Exerciess03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int[][] ShuZu = new int[a][b];
        for (int i = 0; i < ShuZu.length; i++){
            for (int j = 0; j < b; j++){
                if (ShuZu[i][j] == ShuZu[i][0] ){
                    ShuZu[i][j] = 1;
                }
                if (ShuZu[i][j] == ShuZu[i][1]){
                    ShuZu[i][j] = 2;
                }
                System.out.print(ShuZu[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

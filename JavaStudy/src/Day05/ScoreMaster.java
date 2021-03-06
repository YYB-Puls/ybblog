package Day05;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.Scanner;


public class ScoreMaster {
    public static void main(String[] args) {
        //声明六个变量,分别代表六门课程
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiWuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex= 4;
        int ShengWuIndex = 5;
        int totalCcoreCount = 6;


        //每门课程的名字
        String[] names = new String[6];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiWuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入共有多少年的成绩:");
        int yearCout = scanner.nextInt();
        double[][] scores = new double[yearCout][totalCcoreCount];
        for (int i = 0; i < yearCout; i++){
            for (int j = 0; j <totalCcoreCount; j++){
                scores[i][j] = 80 + Math.random() * 20;
                System.out.println("第"+(i+1)+"年"+names[j]+"成绩为:"+scores[i][j]);
            }
        }
        boolean cont = true;
        while (cont){
            System.out.println("请输入要进行的操作:");
            System.out.println("1:求某年最好成绩\n" +
                    "2:求某年的平均成绩\n" +
                    "3:求所有年份最好成绩\n" +
                    "4:求某门课历年最好成绩;");

            int oprId = scanner.nextInt();
            int year = 0;
            switch (oprId){
                case 1 :
                    zuiHaoChengJi(names, scanner, yearCout, scores);
                    break;

                case 2:
                    pingJunChengJi(names, scanner, yearCout, scores);
                    break;

                case 3:
                    //第一个版本
                    /*for (int i = 0; i < yearCout; i++){
                        double ZuiDa = 0;
                        int suoYin = 0;
                        for (int j = 0; j < totalCcoreCount; j++){
                            if (ZuiDa < scores[i][j]){
                               ZuiDa =  scores[i][j];
                               suoYin = j;
                            }
                        }
                        System.out.println("第"+(i+1)+"年的最好成绩为:"+names[suoYin]+":"+ZuiDa);
                    }*/
                    //第二个版本
                    int bestOfYearsScoreId = 0;
                     year = 0;
                    for (int i = 0; i < scores.length; i++){
                        for (int j = 0; j < scores[i].length; j++){
                            if (scores[year][bestOfYearsScoreId] < scores[i][j]){
                                year = i;
                                bestOfYearsScoreId = j;
                            }
                        }
                    }
                    System.out.println("历年最好成绩为第"+(year+1)+"年的"+names[bestOfYearsScoreId]+"成绩为:"+scores[year][bestOfYearsScoreId]);
                    break;
                case 4:
                    System.out.println("请输入要查询哪门课程的历年最好成绩:");
                    int scoreId = scanner.nextInt() - 1;
                    year = 0;
                    for (int i = 1; i < scores.length; i++){
                        if (scores[year][scoreId] < scores[i][scoreId]){
                            year = i;
                        }
                    }
                    System.out.println(names[scoreId] + "历年最好成绩为第"+(year+1)+"年,成绩为:"+scores[year][scoreId]);
                    break;
                default:
                    System.out.println("程序结束!");
                    cont = false;
            }
        }

    }

    private static void pingJunChengJi(String[] names, Scanner scanner, int yearCout, double[][] scores) {
        int year;
        System.out.println("请输入要求哪一年的平均成绩");
        year = scanner.nextInt() -1;
        if (year < 0 || year >= yearCout){
            System.out.println("输入非法年份");
            return;
        }
        double zongfen = 0;
        for (int i = 0; i < scores[year].length; i++){
            zongfen += scores[year][i];
        }
        System.out.println("第"+(year+1)+"年的平均成绩为"+(zongfen / names.length));
    }

    private static void zuiHaoChengJi(String[] names, Scanner scanner, int yearCout, double[][] scores) {
        int year;
        System.out.println("请输入要求哪一年的最好成绩");
        year = scanner.nextInt() -1;
        if (year < 0 || year >= yearCout){
            System.out.println("输入非法年份");
            return;
        }
        int bestOfYearScoreId = 0;
        for (int i = 1; i < scores[year].length; i++){
            if (scores[year][bestOfYearScoreId] < scores[year][i]){
                bestOfYearScoreId = i;
            }
        }
        System.out.println("第"+(year+1)+"年最好的成绩为"+names[bestOfYearScoreId]+":"+scores[year][bestOfYearScoreId]);
    }
}

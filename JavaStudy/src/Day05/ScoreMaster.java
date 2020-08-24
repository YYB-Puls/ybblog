package Day05;

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

        while (true){
            System.out.println("请输入要进行的操作:");
            System.out.println("1:求某年最好成绩\n" +
                    "2:求某年的平均成绩\n" +
                    "3:求所有年份最好成绩\n" +
                    "4:求某门课历年最好成绩;");

            int oprId = scanner.nextInt();
            int year = 0;
            switch (oprId){
                case 1 :
                    System.out.println("请输入要求哪一年的最好成绩");
                    year = scanner.nextInt() -1;
                    if (year < 0 || year >= yearCout){
                        System.out.println("输入非法年份");
                        break;
                    }
                    int bestOfYearScoreId = 0;
                    for (int i = 1; i < scores[year].length; i++){
                        if (scores[year][bestOfYearScoreId] < scores[year][i]){
                            bestOfYearScoreId = i;
                        }
                    }
                    System.out.println("第"+(year+1)+"年最好的成绩为"+names[bestOfYearScoreId]+":"+scores[year][bestOfYearScoreId]);
                    break;
                case 2:
                    System.out.println("请输入要求哪一年的平均成绩");
                    year = scanner.nextInt() -1;
                    if (year < 0 || year >= yearCout){
                        System.out.println("输入非法年份");
                        break;
                    }
                    double zongfen = 0;
                    for (int i = 0; i < scores[year].length; i++){
                        zongfen += scores[year][i];
                    }
                    System.out.println("第"+(year+1)+"年的平均成绩为"+(zongfen / names.length));
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
            }
        }

    }
}

package Day04;

public class ShuZu {
    public static void main(String[] args) {
        //每门成绩对应的索引
        int YuWen = 0;
        int ShuXue = 1;
        int WaiWu = 2;
        int WuLi = 3;
        int HuaXue = 4;
        int ShengWu = 5;

        int totalscoreCount = 6;
        double[] scores = new double[totalscoreCount];

        String[] coreNames = new String[totalscoreCount];
        coreNames[YuWen] = "语文";
        coreNames[ShuXue] = "数学";
        coreNames[WaiWu] = "外语";
        coreNames[WuLi] = "物理";
        coreNames[HuaXue] = "化学";
        coreNames[ShengWu] = "生物";

        for (int i = 0; i < totalscoreCount; i++) {
            scores[i] = 80 + Math.random() * 20;
            System.out.println(coreNames[i] + "的成绩是:" + scores[i]);
        }
        double maxCores = 0;
        int maxScoresIndex = -1;
        for (int i = 0; i < totalscoreCount;i++){
            if (scores[i] > maxCores){
                maxCores = scores[i];
                maxScoresIndex = i;
            }
        }
        System.out.println("最好的成绩科目是"+coreNames[maxScoresIndex]+":"+maxCores);
    }
}

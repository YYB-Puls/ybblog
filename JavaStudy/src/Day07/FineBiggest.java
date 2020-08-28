package Day07;

public class FineBiggest {
    public static void main(String[] args) {
        int arraySize = 55;
        int[] students = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            students[i] = i + 1;

        }
        int biggest = 0;
        for (int i = 0; i < arraySize; i++){
            if (biggest <= students[i]){
                biggest = students[i];
            }

        }
        System.out.println("全班最高的成绩为:"+biggest);
    }
}

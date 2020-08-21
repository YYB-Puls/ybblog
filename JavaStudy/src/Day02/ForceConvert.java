package Day02;

public class ForceConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long  longVal = 999999;
        intVal = (int)longVal;
        System.out.println(intVal);

        float floatVal = 11.32f;
        double doubleVal = 3334445.159;
        floatVal = (float)doubleVal;
        System.out.println(floatVal);

        int intVal2 = 99;
        char chaVal = (char)intVal2;
        System.out.println(chaVal);


    }
}

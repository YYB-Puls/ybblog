package Day02;

public class AutoConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = intVal;
        long longVal2 = intVal + 1;
        System.out.println(longVal2);


        float floatVal = 11.32f;
        double doubleVal = floatVal;
        double doubleVal2 = floatVal * 2;
        System.out.println(doubleVal2);

        doubleVal = longVal;
        doubleVal = intVal;

        floatVal = intVal;
        floatVal = longVal;

        char ch  = 'A';
        int a = ch;
        int b = ch + 10;
        System.out.println(a);
        System.out.println(b);

    }
}

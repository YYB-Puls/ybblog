package Day09;

public class StringEquals {
    public static void main(String[] args) {
        //判断equals和==
        int value = 1;
        String str1 = "ABCD"+value;
        String str2 = "abcd" + value;
        String str3 = "ABCD" + value;
        String str4 = str1;

        boolean equals1 = str1.equals(str2);
        boolean equals2 = str1.equals(str3);
        boolean equals3 = (str1 == str2);
        boolean equals4 = (str1 == str4);
        System.out.println("str1和str2相等"+equals1);
        System.out.println("str1和str3相等"+equals2);
        System.out.println();
        System.out.println(equals3);
        System.out.println(equals4);

        System.out.println("===========================================");

        //判断字符串的开头和结尾
        String str = "ABCD";
        String prefix1 = "ABC";
        String prefix2 = "BCD";

        String prefix3 = "D";
        String prefix4 = "BC";

        boolean started1 = str.startsWith(prefix1);
        boolean started2 = str.startsWith(prefix2);
        boolean endsWith1 = str.endsWith(prefix3);
        boolean endsWith2 = str.endsWith(prefix4);
        System.out.println(started1+"\n"+started2);
        System.out.println();
        System.out.println(started1+","+started2);


    }
}

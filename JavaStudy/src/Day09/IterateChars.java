package Day09;

public class IterateChars {
    public static void main(String[] args) {
        //需要统计的字符串
        String str = "adcsfsesrdfcafgsdfsafse";
        //需要统计的字符
        char target = 's';
        //得到字符串的长度
        int len = str.length();
        //用来保存结果的int变量
        int count = 0;
        //遍历字符串中的每一个字符
        for (int i = 0; i < len; i++){
            //得到字符串中的第i个字符
            char ch = str.charAt(i);
            //如果这个字符是需要统计的则加1
            if (ch == target){
                count++;
            }
        }
        System.out.println("包含s的字符有"+count+"个");
    }
}

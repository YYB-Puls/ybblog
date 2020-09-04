package Day09;

public class SubString {
    public static void main(String[] args) {
        findString();
        String result = "yuanbo".substring(3);
        System.out.println(result);
    }

    private static void findString() {
        //创建字符串
        String str = "ABCDEFGH";
        //要找到的字符
        char ch = 'C';
        //字符长度
        int changdu = str.length();
        //储存字符串
        String chucun = null;
        //遍历目标字符串,寻找目标字符
        for (int i = 0 ; i < changdu; i++){
            //找到字符
            if (ch == str.charAt(i )){
                chucun = str.substring(i);
                break;
            }
        }
        //如果结果不是null
        if (chucun != null){
            System.out.println(chucun);
        }else {
            System.out.println("没有找到该字符");
        }


    }
}

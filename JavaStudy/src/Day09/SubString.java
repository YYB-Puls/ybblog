package Day09;

public class SubString {
    public static void main(String[] args) {
        //目标字符串
        String str = "ADBCDEFGH";
        //目标字符
        char ch = 'C';
        //目标字符长度
        int len = str.length();
        //指向结果字符串的引用
        String result = null;
        //遍历目标字符串,寻找目标字符
        for (int i = 0; i < len ; i++){
            //找到目标字符
            if (ch == str.charAt(i)){
                //使用i+1作为参数调用subString方法
                result = str.substring(i +1);
                //已经得到了结果,无需继续循环
                break;
            }
        }
        //如果结果不是null
        if (result != null){
            //输出结果
            System.out.println(result);
        }else {
            //输出没有找到字符信息
            System.out.println("没有找到字符信息");

        }


    }
}

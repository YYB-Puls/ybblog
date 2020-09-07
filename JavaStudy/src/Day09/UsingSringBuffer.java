package Day09;

public class UsingSringBuffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();
        //添加boolea变量
        stringBuffer.append(true);
        //添加字符串变量
        stringBuffer.append("test");
        //添加一个字符
        stringBuffer.append("\t");
        //循环添加int变量
        for (int i = 0; i < 3; i++){
            stringBuffer.append(i);
        }
        //使用StringBuffer对象内容生成String对象
        String str = stringBuffer.toString();
        //输出字符串内容
        System.out.println(str);
        //从指定索引开始插入索引
        stringBuffer.insert(1, "插入字符");
        str = stringBuffer.toString();
        System.out.println(str);
        //删除指定索引之内容
        stringBuffer .delete(0, 4);
        str = stringBuffer.toString();
        System.out.println(str);
        //替换指定索引之内的内容
        stringBuffer.replace(0,1 ,"代替" );
        str = stringBuffer.toString();
        System.out.println(str);
        //反转字符
        stringBuffer .reverse();
        str = stringBuffer.toString();
        System.out.println(str);

    }
}

package Day17.learnchar;

import java.io.UnsupportedEncodingException;

public class StringToByteArr {
    public static void main(String[] args) {
        try {
            String conter = "字符串到数组";
            byte[] conttenBytes = conter.getBytes("UTF-16BE");
            System.out.println("长度为:"+conter.length());
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
}

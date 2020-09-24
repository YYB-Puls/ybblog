package Day17.learnchar;

import java.io.UnsupportedEncodingException;

public class ByteArrtoString {
    public static void main(String[] args) {
        try {
            byte[] byteContent = new byte[]{ 0x5f, (byte)0x97,0x4e,0x4b,0x4e,0x4d,(byte)0x96,(byte)0xbe};
            String string = new String(byteContent,"UTF-16BE");
            System.out.println(string);
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
}

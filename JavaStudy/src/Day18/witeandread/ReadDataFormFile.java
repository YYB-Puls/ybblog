package Day18.witeandread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFormFile {
    public static void main(String[] args) {
        File dataFile = new File("D:\\DateFileForOutputStram.txt");
        if (dataFile.exists() && dataFile.isFile()) {
            System.out.println("从dateFeileForOutputStream.txt中读取数据");
        }else {
            System.out.println("DataFileForOutpuStream.txt文件不存在");
            return;
        }
        System.out.println("文件内容为:");
        try {
            FileInputStream fis = new FileInputStream(dataFile);
            byte[] data = new byte[1024];
            int len = fis.read(data);
            String content = new String(data,0,len) ;
            System.out.println(content);
            fis.close();
        }catch (FileNotFoundException e){
            System.out.println("找不到文件,错误信息为:"+e.getMessage());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

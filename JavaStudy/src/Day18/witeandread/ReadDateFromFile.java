package Day18.witeandread;

import java.io.*;

public class ReadDateFromFile {
    public static void main(String[] args) {
        File dateFile = new File("D:\\dateFile.txt");
        if (dateFile.exists() && dateFile.isFile()) {
            System.out.println("从文件中读取数据");

        }else{
            System.out.println("dateFile.txt文件不存在");
            return;
        }
        System.out.println("文件中的内容是:");
        try {
            FileReader fr = new FileReader(dateFile);
            BufferedReader bufferedReader = new BufferedReader(fr);
            String content = null;
            while ((content = bufferedReader.readLine()) != null){
                System.out.println(content);
            }
            fr.close();
            bufferedReader.close();
        }catch (FileNotFoundException e){
            System.out.println("找不到文件,错误信息为:"+e.getMessage());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

package Day18.witeandread;



import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        File dateFile = prepareFile("D:\\dateFile.txt");
        PrintWriter pw = null;
        if (dateFile == null) {
            System.out.println("创建数据文件出错,程序退出");
            return;
        }
        try {
            pw = new PrintWriter(dateFile);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            return;
        }
        String content = null;
        String endMark = "end";
        try {
            System.out.println("请输入要写入的文件内容,已end结束:");
            while ((content = br.readLine()) != null){
                if (content.equalsIgnoreCase(endMark)){
                    break;
                }
                pw.write(content+"\t\n");
            }
            pw.close();
            br.close();
            System.out.println("输入结束");
        }catch (IOException e){
            e.printStackTrace();
        }
        printFileContent(dateFile);
    }

    private static void printFileContent(File file){
        System.out.println("文件中的内容:");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String content = null;
            while ((content = br.readLine()) != null){
                System.out.println(content);
            }
            fr.close();
            br.close();
        }catch (FileNotFoundException e ){
            System.out.println("找不到文件,错误信息为:"+e.getMessage());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private  static File prepareFile(String filePath){
        File dateFile = new File(filePath);
        if (dateFile.exists() && dateFile.isFile()){
            System.out.println("使用已经存在的"+filePath+"文件");

        }else {
            try {
                dateFile.createNewFile();
                System.out.println("创建d"+filePath+"文件");
            }catch (IOException e){
                System.out.println("创建d"+filePath+"文件失败,错误信息"+e.getMessage());
                return null;
            }
        }
        return dateFile;
    }
}

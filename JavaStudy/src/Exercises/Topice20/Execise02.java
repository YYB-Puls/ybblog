package Exercises.Topice20;

import javax.swing.*;

public class Execise02 {
    public static void main(String[] args) {
        JFileChooser jFileChooser = new JFileChooser();
        int i  = jFileChooser.showOpenDialog(null);
        if (i == jFileChooser.APPROVE_OPTION ){
            String path = jFileChooser.getSelectedFile().getAbsolutePath();
            String name = jFileChooser.getSelectedFile().getName();
            System.out.println("当前文件路径"+path+";\n当前文件名:"+name);
        }else {
            System.out.println("没有选中文件");
        }
    }


}

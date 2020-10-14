package Day20.learnevent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {

    public  MyListener(){
        //int counter = 0;
    }

    public void actionPerformed(ActionEvent e){
        JFileChooser jFileChooser = new JFileChooser();
        int i  = jFileChooser.showOpenDialog(null);
        if (i == jFileChooser.APPROVE_OPTION ){
            String path = jFileChooser.getSelectedFile().getAbsolutePath();
            String name = jFileChooser.getSelectedFile().getName();
            System.out.println("当前文件路径"+path+";\n当前文件名:"+name);
        }else {
            System.out.println("没有选中文件");
        }
        /*counter++;
        label.setText("事件触发了:"+counter+"次");*/
    }
}

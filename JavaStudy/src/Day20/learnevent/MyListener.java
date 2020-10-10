package Day20.learnevent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    int counter = 0;
    private JLabel label;
    public  MyListener(JLabel label){
        this.label = label;
    }
    public void actionPerformed(ActionEvent e){
        counter++;
        label.setText("事件触发了:"+counter+"次");
    }
}

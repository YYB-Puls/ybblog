package Day20.learnevent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandleEventII {
    private JFrame frame;
    private JButton button;
    private JLabel label;
    class MyListener implements ActionListener{
        int counter = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            counter ++;
            label.setText("事件触发了"+counter+"次");
        }
    }
    public HandleEventII(){
        frame = new JFrame();
        button = new JButton();
        label = new JLabel();
        init();
    }
    public void init(){
       MyListener listener = new MyListener();
       button.addActionListener(listener);
    }

    public void showFrame(){
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        HandleEvent handleEvent = new HandleEvent();
        handleEvent.showFrame();
    }

}

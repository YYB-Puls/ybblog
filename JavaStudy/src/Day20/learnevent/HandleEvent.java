package Day20.learnevent;

import com.sun.org.apache.xml.internal.security.Init;

import javax.swing.*;
import java.awt.*;

public class HandleEvent {
    private JFrame frame;
    private JButton button;
    private JLabel label;

    public HandleEvent(){
        frame = new JFrame();
        button = new JButton();
        label = new JLabel();
        init();
    }
    public void init(){
        frame.setSize(300,100);
        frame.setLocation(new Point(100,300));
        frame.setTitle("学习Swing的事件处理");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(2, 1));
        container.add(label );
        container.add(button );
        button.setText("有事件触发的按钮");
        MyListener listener = new MyListener(label);
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

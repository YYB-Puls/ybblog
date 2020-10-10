package Day20.learncomponent;

import javax.swing.*;
import java.awt.*;

public class LearnLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,200);
        frame.setLocation(new Point(100,300));
        frame.setTitle("学习Swing的组件");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);
        JLabel label = new JLabel();
        label.setText("这是一个标签");
        container.add(label);
        frame.setVisible(true);
        try {
            Thread.sleep(5000);
            label.setEnabled(false);
            Thread.sleep(5000);
            label.setVisible(false);
            Thread.sleep(5000);
            label.setVisible(true);
            Thread.sleep(5000);
            label.setEnabled(true);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

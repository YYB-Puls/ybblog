package Day20.learncomponent;

import javax.swing.*;
import java.awt.*;

public class LearnText {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,100);
        frame.setLocation(new Point(100,300));
        frame.setTitle("学习Swing的组件");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);
        JTextField txt = new JTextField();
        txt.setText("这是一个文本框");
        container.add(txt);
        frame.setVisible(true);
        try {
            Thread.sleep(10000);
            String content = txt.getText();
            System.out.println(content);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

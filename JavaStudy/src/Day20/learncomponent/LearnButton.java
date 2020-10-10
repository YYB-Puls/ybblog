package Day20.learncomponent;

import javax.swing.*;
import java.awt.*;

public class LearnButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,100);
        frame.setLocation(new Point(100,300));
        frame.setTitle("学习Swing的组件");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);
        JButton button = new JButton();
        button.setText("按钮");
        container.add(button);
        frame.setVisible(true);

    }
}

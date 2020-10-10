package Day20.learncomponent;

import javax.swing.*;
import java.awt.*;

public class LearnTextArea {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,100);
        frame.setLocation(new Point(100,300));
        frame.setTitle("学习Swing的组件");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);
        JTextArea area = new JTextArea();
        area.setRows(7);
        area.setColumns(20);
        area.setText("这是一个文本域");
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(area);
        container.add(scrollPane);
        frame.setVisible(true);
    }
}

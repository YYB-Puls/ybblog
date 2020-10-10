package Day20.learnlayout;

import javax.swing.*;
import java.awt.*;

public class ShowLayoutComponent {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        menuBar.add(new JMenu("这是一个菜单"));
        frame.setSize(600,150);
        frame.setTitle("这是一个窗口");
        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(3,2));
        container.add(new JLabel("这是一个标签,可以用来显示文字"));
        container.add(new JComboBox<>(new Object[]{"这是一个组合框,可以用来下拉并选择其中的条目"}));
        container.add(new JButton("这是一个按钮"));
        frame.setVisible(true);

    }
}

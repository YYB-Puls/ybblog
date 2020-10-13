package Day20.learnlayout;

import javax.swing.*;
import java.awt.*;

public class LearnGridBagLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setLocation(new Point(100,300));
        frame.setTitle("学习Swing的布局管理器");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        GridBagLayout layout = new GridBagLayout();
        container.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        JButton btn1 = new  JButton("按钮1");
        JPanel panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        JButton btn2 = new JButton("按钮2");
        JButton btn3 = new JButton("按钮3");
        JPanel Panel2 = new JPanel();
        Panel2.setBackground(Color.BLUE);
        gbc.gridx =0;
        gbc.gridy = 0 ;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        container.add(btn1, gbc);
        gbc.gridx = 1;
        container.add(panel,gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth =2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 0;
        container.add(btn2,gbc);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth =1;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 0;
        gbc.weightx = 0;
        container.add(btn3,gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight =1;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH;
        /*gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        container.add(Panel2,gbc);*/
        /*GridLayout btnslayout = new GridLayout(2,3);
        Panel2.setLayout(btnslayout);
        Panel2.add(new JButton("面板内的按钮1"));
        Panel2.add(new JButton("面板内的按钮2"));
        Panel2.add(new JButton("面板内的按钮3"));
        Panel2.add(new JButton("面板内的按钮4"));
        Panel2.add(new JButton("面板内的按钮5"));*/
        frame.setVisible(true);

    }
}

package Exercises.Topice20;

import javax.swing.*;
import java.awt.*;

/**
 * 在一个JFrame的子类中,使用GridBagLayout将5个JTextField排列成图20-27所示的环状
 */
public class Execise01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setLocation(new Point(100, 100));
        frame.setTitle("学习Swing布局管理");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        GridBagLayout layout = new GridBagLayout();
        container.setLayout(layout);

        JTextField jb1 = new JTextField("1");
        JTextField jb2 = new JTextField("2");
        JTextField jb3 = new JTextField("3");
        JTextField jb4 = new JTextField("4");
        JTextField jb5 = new JTextField("5");

        GridBagConstraints gbc1 = makeGbc(0, 0, 2, 1);
        GridBagConstraints gbc2 = makeGbc(2, 0, 1, 2);
        GridBagConstraints gbc3 = makeGbc(1, 2, 2, 1);
        GridBagConstraints gbc4 = makeGbc(0, 1, 1, 2);
        GridBagConstraints gbc5 = makeGbc(1, 1, 1, 1);

        container.add(jb1,gbc1);
        container.add(jb2,gbc2);
        container.add(jb3,gbc3);
        container.add(jb4,gbc4);
        container.add(jb5,gbc5);

        frame.setVisible(true);
    }

    private static GridBagConstraints makeGbc(int gridX, int gridY, int widX, int widY) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gridX;
        gbc.gridy = gridY;
        gbc.gridwidth = widX;
        gbc.gridheight = widY;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        return gbc;
    }
}

package Exercises.Topice20;

import javax.swing.*;
import java.awt.*;

/**
 * 在一个JFrame的子类中,使用GridBagLayout将5个JTextField排列成图20-27所示的环状
 */
public class Execise01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setLocation(new Point(100,100));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(3,3));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.gridwidth = 200 ;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        container.add(new JTextField("1"),gbc);
        container.add(new JTextField("2"));
        container.add(new JTextField("3"));
        container.add(new JTextField("4"));
        container.add(new JTextField("5"));
        frame.setVisible(true);

    }
}

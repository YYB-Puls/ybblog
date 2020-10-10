package Day20.learncomponent;

import javax.swing.*;
import java.awt.*;

public class LearnJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,100);
        frame.setLocation(new Point(100,100));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        frame.setVisible(true);
    }
}

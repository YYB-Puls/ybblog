package Day20.learncomponent;

import javax.swing.*;
import java.awt.*;

public class LearnText2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,100);
        frame.setLocation(new Point(100,300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);
        JComboBox comboBox = new JComboBox(new Object[]{"选项一","选项二"});
        comboBox.addItem("选项三");
        comboBox.setSelectedIndex(1);
        Object object = comboBox.getSelectedItem();
        System.out.println("当前选中的选项是:"+object);
        container.add(comboBox);
        frame.setVisible(true);
    }
}

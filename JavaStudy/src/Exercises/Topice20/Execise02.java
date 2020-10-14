package Exercises.Topice20;

import Day20.learnevent.MyListener;

import javax.swing.*;
import java.awt.*;

/**
 * 为第19章课后题中发送文件程序开发一个GUI.
 * GUI应该完成的功能有选择目标文件(通过Javadoc学习JfileChoser的使用)
 * 填写目标IP地址以及发送文件操作
 */

public class Execise02 {
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JTextField textField;

    public Execise02(){
        frame = new JFrame();
        button = new JButton("请选择文件");
        textField = new JTextField("请输入IP地址");
        //jFileChooser = new JFileChooser();
        label = new JLabel();
        init();
    }

    public void init(){
        frame.setSize(300,200);
        frame.setLocation(new Point(100,300));
        frame.setTitle("文件管理");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(2,1));
        container.add(button);
        container.add(textField);
        container.add(label);
        MyListener listener = new MyListener();
        button.addActionListener(listener);
    }

    public void showFrame(){
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Execise02 execise02 = new Execise02();
        execise02.showFrame();
    }


}

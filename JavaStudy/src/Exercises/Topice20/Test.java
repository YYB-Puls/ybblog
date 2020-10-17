package Exercises.Topice20;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// FIXME: 2020/10/17  JTextField输入的内容无法显示在JLabel里面   添加了事件  点击确认无法显示   目前就这里出问题   现在思路被磨灭了 今天心态没了明天继续

public class Test {
    private JLabel label;
    private JButton button;
    private JTextField text;


    private  JFrame getFrame(){
        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocation(new Point(100, 100));
        frame.setTitle("聊天系统");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,1));
       final Container container = frame.getContentPane();

        container.add(label = new JLabel("请输入ip地址:"));
        container.add(text = new JTextField("text") );
        container.add(button =new JButton("确认"));
        container.add(button =new JButton("发送"));
        container.add(button = new JButton("选择文件"));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = button.getText();
                if (s.equals("发送") && e.getSource() == button) {

                }else if (s.equals("选择文件") && e.getSource() == button){
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.showOpenDialog(null);
                    System.out.println("路径是:"+fileChooser.getSelectedFile());
                }else if (s.equals("确认") && e.getSource() == button){
                   JLabel label2 =  new JLabel();
                   label2.setText(text.getText());
                   container.add(label2);
                }
            }
        });
        frame.setVisible(true);
        return frame;
    }

    private void getIp(JTextField text){
        label.setText(text.getText());
    }


    public static void main(String[] args) {
        Test test = new Test();
        test.getFrame();
    }

}

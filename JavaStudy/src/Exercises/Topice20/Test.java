package Exercises.Topice20;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
// FIXME: 2020/10/19  20章习题2
// FIXME: 2020/10/17  JTextField输入的内容无法显示在JLabel里面   添加了事件  点击确认无法显示   目前就这里出问题   现在思路被磨灭了 今天心态没了明天继续

public class Test {
    private JLabel label;
    private JButton button;
    private JTextField text;
    String getText;
    String poat;


    private  JFrame getFrame(){
        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocation(new Point(100, 100));
        frame.setTitle("聊天系统");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,1));
       final Container container = frame.getContentPane();
        container.add(label = new JLabel("请输入ip地址:"));
        container.add(text = new JTextField() );
        container.add(button = new JButton("选择文件"));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = button.getText();
                if (s.equals("选择文件") && e.getSource() == button){
                    getText = text.getText();
                    System.out.println("ip地址是:"+getText);
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.showOpenDialog(null);
                    File file = fileChooser.getSelectedFile();
                    System.out.println("路径是:"+file);
                    String content = inputFile(file);
                    scoket(getText, content);
                }
            }
        });
        frame.setVisible(true);
        return frame;
    }

    private static void scoket(String getText,String content){
        try {
            Socket socket = new Socket(getText,9999);
            System.out.println("连接成功!");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(content);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println("连接失败"+ e.getMessage());
        }

    }

    private static String inputFile(File poat){
        String content = "";
        try {
            FileInputStream inputStream = new FileInputStream(poat);
            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1){
                content += new String(bytes , 0 ,len , "UTF-8") ;
                System.out.println(content);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.getFrame();
    }

}

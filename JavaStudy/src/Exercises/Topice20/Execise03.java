package Exercises.Topice20;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Execise03 {
    public static void main(String[] args) {
        showFrame();
    }

    public static void showFrame() {
        JFrame frame = makeFrame();

        Container container = frame.getContentPane();
        GridBagLayout layout = new GridBagLayout();
        container.setLayout(layout);

        JLabel label = new JLabel("客服端:");
        final JTextField input = new JTextField("请输入文字");
        JLabel label1 = new JLabel("ip地址:");
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        System.out.println("请输入ip地址:");
        final JTextField ipInput = new JTextField(ip);
        JButton btnSend = new JButton("发送");
        JButton btnFile = new JButton("传文件");

        GridBagConstraints label1Gbc = getGbc(0, 0, 1, 1, 1, 1, GridBagConstraints.BOTH);
        GridBagConstraints ipInputGbc = getGbc(1, 0, 7, 1, 8, 1, GridBagConstraints.BOTH);
        GridBagConstraints labelGbc = getGbc(0, 1, 1, 1, 1, 3, GridBagConstraints.BOTH);
        GridBagConstraints inputGbc = getGbc(0, 3, 1, 1, 6, 1, GridBagConstraints.BOTH);
        GridBagConstraints btnSendGbc = getGbc(6, 3, 1, 1, 1, 1, GridBagConstraints.BOTH);
        GridBagConstraints btnFileGbc = getGbc(7, 3, 1, 1, 1, 1, GridBagConstraints.BOTH);
        container.add(label, labelGbc);
        container.add(input, inputGbc);
        container.add(btnSend, btnSendGbc);
        container.add(btnFile, btnFileGbc);
        container.add(label1, label1Gbc);
        container.add(ipInput, ipInputGbc);
        getIp(label1);
        btnFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                String strIp = ipInput.getText();
                int i = fileChooser.showOpenDialog(null);
                if (i == fileChooser.APPROVE_OPTION) {
                    String path = fileChooser.getSelectedFile().getAbsolutePath();
                    String content = readFileContent(path);
                    try {
                        sendContent(content,strIp);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    System.out.println("没有选中文件");
                }
            }
        });

        frame.setVisible(true);
    }

    private static void sendContent(String content,String s) throws IOException {
        Socket socket = new Socket(s,9999);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(content);
        bw.flush();
        bw.close();
    }

    private static String readFileContent(String path) {
        String content = "";
        File file = new File(path);
        if (file.exists()) {
            try {

                FileInputStream fis = new FileInputStream(file);
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    content += new String(bytes, 0, len, "UTF-8");
                    System.out.println(content);
                }
            } catch (FileNotFoundException e3) {
                e3.printStackTrace();
            } catch (UnsupportedEncodingException e1) {
                e1.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } else {
            System.out.println("未找到文件");
        }
        return content;
    }

    private static GridBagConstraints getGbc(int gridx, int gridy, int gridw, int gridh, double weightx, double  weighty, int fill) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridw;
        gbc.gridheight = gridh;
        gbc.fill = fill;
        gbc.weightx = weightx;
        gbc.weighty = weighty;
        return gbc;
    }

    private static JFrame makeFrame() {
        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocation(new Point(100, 100));
        frame.setTitle("聊天系统");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    private static String getIp(JLabel label){
        String getIp = label.getText();
        return getIp;
    }

}

package com.lzw;

import javax.security.auth.login.LoginContext;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.beans.PropertyVetoException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.prefs.Preferences;

public class JXCFrame {
    private JDesktopPane desktopPane;
    private JFrame frame;
    private JLabel backLable;
    private Preferences preferences;

    private Map<String ,JInternalFrame> ifs = new HashMap<String , JInternalFrame>();
    public JXCFrame(){
        frame = new JFrame("企业进销存管理系统");
        frame.addContainerListener(new ContainerAdapter() {
            @Override
            public void componentAdded(ContainerEvent e) {
                super.componentAdded(e);
            }
        });
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setBounds(100,100,800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backLable = new JLabel();
        backLable.setVerticalAlignment(SwingConstants.TOP);
        backLable.setHorizontalAlignment(SwingConstants .CENTER);
        updateBackImage();
        desktopPane = new JDesktopPane();
        desktopPane.add(backLable,new Integer(Integer.MIN_VALUE));
        frame.getContentPane().add(desktopPane );
        JTabbedPane navigationPanel = createNavigationPanel();
        frame.getContentPane().add(navigationPanel,BorderLayout.NORTH );
        frame.setVisible(true);
    }

    private void updateBackImage(){
        if (backLable != null) {
            int backw = JXCFrame.this.frame.getWidth();
            int backh = frame.getHeight();
            backLable.setText("<thml><body><image width=\"+backw" +
                    "+\"height=\"+(backh -110)+\"src=\"+" +
                    "JXCFrame.this.getClass().getResource(\"welcome.jpg\")+\"></img></body></html>");
        }
    }

    private JTabbedPane createNavigationPanel(){
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setFocusable(false);
        tabbedPane.setBackground(new Color(211,230,192));
        tabbedPane.setBorder(new BevelBorder(BevelBorder.RAISED));
        JPanel baseManagePanel = new JPanel();
        baseManagePanel.setBackground(new Color(215,223,194));
        baseManagePanel.setLayout(new BoxLayout(baseManagePanel,BoxLayout.X_AXIS ));
        baseManagePanel.add(createFrameButton("客户信息管理","KeHuGuanLi" ));
        baseManagePanel.add(createFrameButton("商品信息管理","ShangPinGuanLi" ));
        baseManagePanel.add(createFrameButton("供应商信息管理","GysGuanLi" ));
        JPanel depotManagePanel = new JPanel();
        depotManagePanel.setBackground(new Color(215,223,194));
        depotManagePanel.setLayout(new BoxLayout(depotManagePanel,BoxLayout.X_AXIS ));
        depotManagePanel.add(createFrameButton("库存盘点","KuCunPanDian" ) );
        depotManagePanel.add(createFrameButton("价格调整","JiaGeDiaoZheng" ) );
        JPanel sellManagePanel = new JPanel();
        sellManagePanel.setBackground(new Color(215,223,194));
        sellManagePanel.setLayout(new BoxLayout(sellManagePanel,BoxLayout.X_AXIS ));
        sellManagePanel.add(createFrameButton("销售单","XiaoShouDan" ) );
        sellManagePanel.add(createFrameButton("销售退货","XiaoShouTuiHuo" ) );
        JPanel searchStatisticPanel = new JPanel();
        searchStatisticPanel.setBounds(0,0,600,41);
        searchStatisticPanel.setName("serchStatisticPanel");
        searchStatisticPanel.setBackground(new Color(215,223,194));
        searchStatisticPanel.setLayout(new BoxLayout(searchStatisticPanel,BoxLayout.X_AXIS ));
        searchStatisticPanel.add(createFrameButton("客户信息查询","KeHuXinXiChaXun" ) );
        searchStatisticPanel.add(createFrameButton("商品信息查询","ShangPinXinXiChaXun" ) );
        searchStatisticPanel.add(createFrameButton("供应商信息查询","GysXinXiChaXun" ) );
        searchStatisticPanel.add(createFrameButton("销售信息查询","XiaoShouXinXiChaXun" ) );
        searchStatisticPanel.add(createFrameButton("销售退货查询","XiaoShouTuiHuoChaXun" ) );
        searchStatisticPanel.add(createFrameButton("入库信息查询","RuKuXinXiChaXun" ) );
        searchStatisticPanel.add(createFrameButton("入库退货信息查询","RuKuTuiHuoXinXiChaXun" ) );
        searchStatisticPanel.add(createFrameButton("销售排行","XiaoShouPaiHang" ) );
        JPanel stockManagePanel = new JPanel();
        searchStatisticPanel.setBackground(new Color(215,223,194));
        searchStatisticPanel.setLayout(new BoxLayout(searchStatisticPanel,BoxLayout.X_AXIS ));
        searchStatisticPanel.add(createFrameButton("进货单", "JinHuoDan") );
        searchStatisticPanel.add(createFrameButton("进货退单","JinHuoTuiDan" ) );
        JPanel sysManagePanel = new JPanel();
        searchStatisticPanel.setBackground(new Color(215,223,194));
        searchStatisticPanel.setLayout(new BoxLayout(searchStatisticPanel,BoxLayout.X_AXIS ));
        sysManagePanel.add(createFrameButton("操作员管理","CaoZuoYuanGuanLi" ) );
        sysManagePanel.add(createFrameButton("更改密码","GengGaiMiMa" ) );
        sysManagePanel.add(createFrameButton("权限管理","QuanXianGuanLi" ) );

        tabbedPane.addTab("     基础信息管理    ",null,baseManagePanel,"基础信息管理" );
        tabbedPane.addTab("       进货管理      ", null,stockManagePanel,"进货管理");
        tabbedPane.addTab("       销售管理      ", null,sellManagePanel,"销售管理");
        tabbedPane.addTab("       查询统计      ", null,searchStatisticPanel,"查询统计");
        tabbedPane.addTab("       库存管理      ", null,depotManagePanel,"库存管理");
        tabbedPane.addTab("       系统管理      ", null,sysManagePanel,"系统管理");
        return tabbedPane;
    }

    public JButton createFrameButton(String fName , String cname){
        String imgUrl = "res/ActionLcon/"+fName+".png";
        String imgUrl_roll = "res/ActionLcon/" + frame+"_rool.png";
        String imgUrl_down = "res/ActionLcon/"+frame+"_down.png";
        Icon icon = new ImageIcon(imgUrl);
        Icon icon_roll = null;
        if (imgUrl_roll != null) {
            icon_roll = new ImageIcon(imgUrl_roll);
        }
        Icon icon_down = null;
        if (imgUrl_down != null) {
            icon_down =  new ImageIcon(imgUrl_down);
        }
        Action action = new openFrameAction(fName,cname,icon);
        JButton button = new JButton(action);
        button.setMargin(new Insets(0, 0, 0, 0));
        button.setHideActionText(true);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        if (icon_roll != null) {
            button.setRolloverIcon(icon_roll);
        }
        if (icon_down != null) {
            button.setPressedIcon(icon_down);
        }
        return button;
    }

    protected final class openFrameAction extends AbstractAction{
        private String frameName = null;
        private openFrameAction(){
        }
        public openFrameAction(String cname,String frameName,Icon icon){
            this.frameName =frameName;
            putValue(Action.NAME, cname);
            putValue(Action.SHORT_DESCRIPTION, cname);
            putValue(Action.SMALL_ICON, icon);
        }
        public void actionPerformed(final ActionEvent e){
            JInternalFrame jf = getlFrame(frameName);
            jf.addInternalFrameListener(new InternalFrameAdapter() {
                @Override
                public void internalFrameClosed(InternalFrameEvent e) {
                    ifs.remove(frameName);
                }
            });
            if (jf.getDesktopPane() == null) {
                desktopPane.add(jf);
                jf.setVisible(true);
            }

            try {
                jf.setSelected(true);
            } catch (PropertyVetoException e1) {
                e1.printStackTrace();
            }

        }
    }

    private JInternalFrame getlFrame(String frameName){
        JInternalFrame jf = null;
        if (!ifs.containsKey(frameName)){
            try {
                Class fClass = Class.forName("internalFrame."+frameName);
                Constructor constructor = fClass.getConstructor(null);
                jf = (JInternalFrame) constructor.newInstance(null);
                ifs.put(frameName, jf);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else {
            jf = ifs.get(frameName);
        }
        return jf;
    }

    static {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new Login();
            }
        });
    }
}

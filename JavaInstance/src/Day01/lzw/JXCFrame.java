package Day01.lzw;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.prefs.Preferences;

public class JXCFrame {
    private JDesktopPane desktopPane;
    private JFrame frame;
    private JLabel backLabel;
    private Preferences preferences;

    private Map<String ,JInternalFrame> ifs = new HashMap<String ,JInternalFrame>();
    public JXCFrame(){
        frame = new JFrame("企业进销存管理系统");
        frame.addComponentListener(new FrameListener());
    }
}

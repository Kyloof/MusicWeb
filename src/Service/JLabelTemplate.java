package Service;

import javax.swing.*;
import java.awt.*;

public class JLabelTemplate extends JLabel {
    String s;

    public JLabelTemplate(String s) {
        this.s = s;
        JLabel jLabel = new JLabel(s);
        jLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        jLabel.validate();
        int h = jLabel.getPreferredSize().height;
        jLabel.setPreferredSize(new Dimension(240, h));

    }

}

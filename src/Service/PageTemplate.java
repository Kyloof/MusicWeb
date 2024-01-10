package Service;

import javax.swing.*;
import java.awt.*;

public class PageTemplate extends JPanel {
    Image webLogo;
    PageTemplate(){
        webLogo = new ImageIcon("LOGO.png").getImage();
        this.setPreferredSize(new Dimension(400,400));
    }
    public void paint(Graphics2D g2d){
        g2d.drawImage(webLogo,0,0,null);
    }
}

package Service;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

public class LogoPanel extends JPanel {
    private BufferedImage webLogo;

    public LogoPanel() {
        try {
            webLogo = ImageIO.read(new FileInputStream("resources/LOGO.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Image scaledImage = webLogo.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        g.drawImage(scaledImage, 0, 0, this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400); // Ustaw dowolne preferowane wymiary
    }
}
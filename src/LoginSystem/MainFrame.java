package LoginSystem;

import Database.UsernamesAndPasswords;
import Service.JLabelTemplate;
import Service.LogoPanel;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainFrame extends JFrame{
    private WelcomePage welcomePage;
    public MainFrame(){

        final Dimension FRAME_SIZE = new Dimension(400, 400);
        final Dimension PANEL1_SIZE = new Dimension(400, 250);
        final Dimension PANEL2_SIZE = new Dimension(400, 40);
        final Dimension PANEL3_SIZE = new Dimension(400, 40);


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(FRAME_SIZE);
        setMaximumSize(FRAME_SIZE);
        setTitle("MusicWeb");
    }

}

class WelcomePage extends JFrame implements ActionListener {

    JPanel newPanel;
    JLabel welcomeText = new JLabel("Witaj na MusicWeb!",SwingConstants.CENTER);
    JButton loginButton = new JButton("Zaloguj się");
    JButton registerButton = new JButton("Zarejestruj się");


    public WelcomePage(){
        LogoPanel logoPanel = new LogoPanel();
        newPanel = new JPanel(new GridLayout(5, 1));
        newPanel.add(welcomeText);
        newPanel.add(loginButton);
        newPanel.add(registerButton);
        newPanel.add(logoPanel);

        add(newPanel, BorderLayout.CENTER);

        registerButton.addActionListener(this);
        loginButton.addActionListener(this);

    }

    public void buildGUI() {

        //defines the Layout for the main Frame
        this.setLayout(new GridLayout(3,1));




        //Set attributes
        //Pack components together inside of frame
        pack();
        //Center of screen
        setLocationRelativeTo(null);
        //Make frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==registerButton) {
            RegisterPage registerPage = new RegisterPage();
            JComponent comp = (JComponent) e.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();

        }

        if(e.getSource()==loginButton) {
            LoginPage loginPage = new LoginPage(UsernamesAndPasswords.getLoginInfo());
            JComponent comp = (JComponent) e.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
        }

    }
}

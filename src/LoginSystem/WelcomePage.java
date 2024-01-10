package LoginSystem;

import Database.UsernamesAndPasswords;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage implements ActionListener {
    JFrame frame = new JFrame();
    JLabel welcomeText = new JLabel("Witaj na MusicWeb!");
    JButton loginButton = new JButton("Zaloguj się");
    JButton registerButton = new JButton("Zarejestruj się");

    public WelcomePage(){

        welcomeText.setBounds(500, 100, 150, 25);




        loginButton.setBounds(300, 800, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        registerButton.setBounds(700, 800, 100, 25);
        registerButton.setFocusable(false);
        registerButton.addActionListener(this);


        frame.add(welcomeText);
        frame.add(loginButton);
        frame.add(registerButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1080);
        frame.setLayout(null);
        frame.setVisible(true);

}
    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==registerButton) {
            RegisterPage registerPage = new RegisterPage();
            frame.dispose();

        }

        if(e.getSource()==loginButton) {
            LoginPage loginPage = new LoginPage(UsernamesAndPasswords.getLoginInfo());
            frame.dispose();
        }

    }
}

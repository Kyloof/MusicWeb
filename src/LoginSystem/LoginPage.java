package LoginSystem;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class LoginPage implements ActionListener {



    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField usernameField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("Nazwa Użytkownika:");
    JLabel userPasswordLabel = new JLabel("Hasło:");
    JLabel messageLabel = new JLabel();
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    public LoginPage(HashMap<String, String> loginInfoOriginal) {

        loginInfo = loginInfoOriginal;

        userIDLabel.setBounds(5, 100, 150, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 10));

        usernameField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);


        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(usernameField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==resetButton) {
            usernameField.setText("");
            userPasswordField.setText("");
        }

        if(e.getSource()==loginButton) {

            String username = usernameField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(loginInfo.containsKey(username)) {
                if(loginInfo.get(username).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Pomyślnie zalogowano");


                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wprowadzono złe hasło");
                }

            }
            else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Nie znaleziono użytkownika o podanej nazwie");
            }
        }
    }
}

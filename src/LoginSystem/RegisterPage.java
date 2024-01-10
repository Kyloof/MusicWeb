package LoginSystem;

import DataValidation.*;
import Users.CasualUser;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class RegisterPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton registerButton = new JButton("Register");
    JButton resetButton = new JButton("Reset");
    JTextField usernameField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JTextField userEmailField = new JPasswordField();
    JLabel userIDLabel = new JLabel("Nazwa Użytkownika:");
    JLabel userPasswordLabel = new JLabel("Hasło:");
    JLabel userEmailLabel = new JLabel("Email:");

    JLabel messageLabel = new JLabel();


    public RegisterPage() {



        userIDLabel.setBounds(0, 100, 150, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);
        userEmailLabel.setBounds(50, 200, 150, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 10));

        usernameField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);
        userEmailField.setBounds(125, 200, 200, 25);

        registerButton.setBounds(125, 250, 100, 25);
        registerButton.setFocusable(false);
        registerButton.addActionListener(this);

        resetButton.setBounds(225, 250, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(userEmailLabel);
        frame.add(messageLabel);
        frame.add(usernameField);
        frame.add(userPasswordField);
        frame.add(userEmailField);
        frame.add(registerButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==resetButton) {
            usernameField.setText("");
            userPasswordField.setText("");
        }

        if(e.getSource()== registerButton) {

            String username = usernameField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            String email = userEmailField.getText();

            //Weryfikacja czy mail jest poprawny
            if (!email.contains("@") || email.length()<5) {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Wprowadzono zły mail");
            }
            else{
                messageLabel.setForeground(Color.green);
                CasualUser newUser = new CasualUser(username,password,email,null,"junior");
                messageLabel.setText("Pomyślnie zarejestrowano");
                frame.dispose();


            }




        }
    }
}

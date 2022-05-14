package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {
    private JLabel amherstACETriviaLabel;
    private JTextField userText;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JFrame frame;
    private JPanel panel1;

    public LoginPage() {
        frame = new JFrame("Welcome to Amherst ACE!");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250, 200)); //250,200
        frame.setResizable(false);

        loginButton.addActionListener(this);

        // now add the panel
        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Login")) {
            if(!userText.getText().equals("") && !passwordField1.equals("")) {
                Quiz fram1 = new Quiz();
                frame.setVisible(false);
            }
        }
    }
}
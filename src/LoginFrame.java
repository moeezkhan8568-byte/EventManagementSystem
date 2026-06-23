import javax.swing.*;
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {

    JLabel lblUser, lblPass;
    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnLogin;

    User user = new User();

    public LoginFrame() {

        setTitle("Login System");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblUser = new JLabel("Username:");
        lblUser.setBounds(30, 30, 80, 25);
        add(lblUser);

        txtUser = new JTextField();
        txtUser.setBounds(120, 30, 120, 25);
        add(txtUser);

        lblPass = new JLabel("Password:");
        lblPass.setBounds(30, 70, 80, 25);
        add(lblPass);

        txtPass = new JPasswordField();
        txtPass.setBounds(120, 70, 120, 25);
        add(txtPass);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 110, 100, 30);
        btnLogin.addActionListener(this);
        add(btnLogin);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String username = txtUser.getText();
        String password = String.valueOf(txtPass.getPassword());

        if (user.login(username, password)) {

            JOptionPane.showMessageDialog(this,
                    "Login Successful");

            new DashboardFrame();
            dispose();

        } else {

            JOptionPane.showMessageDialog(this,
                    "Invalid Username or Password");
        }
    }
}
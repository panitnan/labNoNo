import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField txtUserLogin;
    private JTextField pwdUserPassword;
    private JButton btnsubmit;
    private JButton btnclear;

    public Login() {
        btnsubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,txtUserLogin.getText());
            }
        });
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel panel1;
    private JLabel jlLogin;
    private JLabel jlSenha;
    private JTextField jtfLogin;
    private JPasswordField jtfSenha;
    private JButton jbLogin;
    private JButton jbCancel;

    public Login() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel1 = new JPanel();
        panel1.setLayout(null);
        setContentPane(panel1);

        jlLogin = new JLabel("Login:");
        jlLogin.setBounds(10, 20, 80, 25);
        panel1.add(jlLogin);

        jtfLogin = new JTextField(20);
        jtfLogin.setBounds(100, 20, 165, 25);
        panel1.add(jtfLogin);

        jlSenha = new JLabel("Senha:");
        jlSenha.setBounds(10, 50, 80, 25);
        panel1.add(jlSenha);

        jtfSenha = new JPasswordField(20);
        jtfSenha.setBounds(100, 50, 165, 25);
        panel1.add(jtfSenha);

        jbLogin = new JButton("Login");
        jbLogin.setBounds(10, 80, 80, 25);
        panel1.add(jbLogin);

        jbCancel = new JButton("Cancel");
        jbCancel.setBounds(180, 80, 80, 25);
        panel1.add(jbCancel);

        jbLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = jtfLogin.getText();
                String password = new String(jtfSenha.getPassword());

                if (validateLogin(username, password)) {
                    JOptionPane.showMessageDialog(Login.this, "Login successful!");
                    openMainMenu();
                } else {
                    JOptionPane.showMessageDialog(Login.this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        jbCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  // Fecha a aplicação
            }
        });
    }

    private boolean validateLogin(String username, String password) {
        return "admin".equals(username) && "123".equals(password);
    }

    public void openMainMenu() {
        MainMenu.MainMenu mainMenu = new MainManu.MainMenu();
        mainMenu.setVisible(true);
        this.dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}

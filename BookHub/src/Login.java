import javax.swing.*;
import java.awt.event.*;

public class Login extends JDialog {
    private JPanel contentPane;
    private JButton entrarBtt;
    private JButton fecharBtt;
    private JButton resetarBtt;
    private JTextField textField1;
    private JPasswordField passwordField1;


    public Login() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(entrarBtt);

        entrarBtt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onEntrar();
            }
        });

        fecharBtt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onFechar();
            }
        });
        resetarBtt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onResetar();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onFechar();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onFechar();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }
    //comando ao clicar em Entrar
    private void onEntrar() {
        String username = textField1.getText();
        char[] password = passwordField1.getPassword();
        String passwordStr = new String(password);

        // Chame o método para verificar as credenciais no banco de dados
        //
        if (DatabaseUtil.checkLogin(username, passwordStr)) {
            JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
            AdminGUI adminGUI = new AdminGUI();
            adminGUI.setVisible(true);

            // Feche a janela de login (opcional)
            dispose();
            // Adicione a lógica para abrir a próxima janela após o login
        } else {
            JOptionPane.showMessageDialog(null, "Login falhou. Tente novamente.");
        }
    }
    // comando ao clicar em fechar:
    private void onFechar() {
        // add your code here if necessary
        dispose();
    }
    // Comando ao clicar em resetar:
    private void onResetar() {
        // add your code here if necessary
        dispose();
    }
    //Executar código
    public static void main(String[] args) {
        Login dialog = new Login();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}

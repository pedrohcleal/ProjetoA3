package Login;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    public Login() {
        super("BookHub"); // Ajusta o título
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Ajusta a ação ao fechar
        setResizable(true);
        setSize(700, 700);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screen = tk.getScreenSize();
        setLocation((int) ((screen.getWidth()) / 2), (screen.height - getHeight()) / 2);

        // Criação de painel para os campos de texto
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2)); // Três linhas, duas colunas

        // Rótulo e campo de texto para o login
        JLabel loginLabel = new JLabel("Login:");
        JTextField loginTextField = new JTextField(20); // 20 caracteres de largura

        // Rótulo e campo de texto para a senha
        JLabel senhaLabel = new JLabel("Senha:");
        JPasswordField senhaPasswordField = new JPasswordField(20); // 20 caracteres de largura

        // Botão de login
        JButton loginButton = new JButton("Login");

        // Adicione um ouvinte de ação ao botão de login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Coloque aqui a lógica para verificar o login e senha
                String username = loginTextField.getText();
                char[] password = senhaPasswordField.getPassword();
                String passwordStr = new String(password);

                // Aqui você pode verificar as credenciais
                if (username.equals("seu_usuario") && passwordStr.equals("sua_senha")) {
                    JOptionPane.showMessageDialog(Login.this, "Login bem-sucedido!");
                } else {
                    JOptionPane.showMessageDialog(Login.this, "Login falhou. Tente novamente.");
                }
            }
        });

        // Adicione os componentes ao painel
        panel.add(loginLabel);
        panel.add(loginTextField);
        panel.add(senhaLabel);
        panel.add(senhaPasswordField);
        panel.add(loginButton);

        // Adicione o painel à janela
        getContentPane().add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        System.out.println("Inicializado");
        SwingUtilities.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
}

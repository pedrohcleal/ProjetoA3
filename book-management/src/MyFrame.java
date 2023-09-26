import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("Book Hub"); //seta o título do frama
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exibi sair do app(X)
        this.setResizable(true); // se o tamanho da janela pode ser reajustado
        this.setSize(600,600); // tamanho inicial da janela
        this.setVisible(true); // tornar visível

        ImageIcon logo = new ImageIcon("logo.jpeg"); //Cria um objeto uma instancia de imagem
        this.setIconImage(logo.getImage()); //seta a imagem com objeto acima
        this.getContentPane().setBackground(new Color(0,150,0));// mudar cor do fundo do this
    }

}

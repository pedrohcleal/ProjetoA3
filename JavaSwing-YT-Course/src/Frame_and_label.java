import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Frame_and_label {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("logo.jpg");
        Border border = BorderFactory.createLineBorder(Color.green,3); // seta instancia e já adiciona a cor da borda


        JLabel label = new JLabel();// cria label

        label.setText("Book Hub"); // setar texto da lavel
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //Setar local do texto da imagemicon
        label.setVerticalTextPosition(JLabel.TOP); //seta local do texto na vertical
        label.setForeground(new Color(102, 255, 0)); //seta cor do texto
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); //seta fonte do texto
        label.setIconTextGap(-24); //seta a distancia entre o titulo e imagem
        label.setBackground(Color.black); // cor de fundo do display
        label.setOpaque(true); //cor de fundo do display
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // seta a posição vertical do icone+texto com a label
        label.setHorizontalAlignment(JLabel.CENTER); // seta posição horizontal do contexto geral
        //label.setBounds(100,0,250,250); //seta dimensões do label dentro do frame

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
        //new MyFrame();
    }
}
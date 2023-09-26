# Exemplos de aplicações

# 1# - Hierarquia
A hierarquia de componentes do Java Swing é uma parte fundamental da estrutura de desenvolvimento de interfaces gráficas de usuário (GUI) no Java. O Swing é uma biblioteca de componentes GUI que permite criar aplicativos de desktop com uma aparência e comportamento consistentes em várias plataformas. A hierarquia de componentes do Swing é organizada em uma árvore, onde cada componente é um nó na árvore e possui um relacionamento hierárquico com outros componentes. Vou explicar os principais componentes dessa hierarquia:

1. **JFrame**: O `JFrame` é o principal contêiner de nível superior que representa a janela principal do aplicativo. Ele pode conter outros componentes, como botões, painéis e menus. Um aplicativo Swing geralmente começa com a criação de um `JFrame`.

2. **JPanel**: O `JPanel` é um contêiner que pode ser usado para agrupar outros componentes. Ele é usado para criar áreas organizadas em um `JFrame`. Os painéis podem ser aninhados para criar layouts complexos.

3. **JComponent**: A maioria dos componentes Swing herda de `JComponent`, que é uma classe base para todos os componentes Swing. Ela fornece funcionalidades comuns, como manipulação de eventos e pintura.

4. **Container**: A classe `Container` é uma superclasse de `JFrame`, `JPanel` e outros contêineres. Ela define a funcionalidade básica para adicionar, remover e organizar os componentes filhos.

5. **Componentes de Conteúdo**: São os componentes que podem ser colocados em um contêiner. Alguns exemplos incluem:
   - **JButton**: Um botão que pode ser clicado para acionar ações.
   - **JLabel**: Uma etiqueta de texto para exibir informações.
   - **JTextField**: Uma caixa de texto para entrada de texto.
   - **JTextArea**: Uma área de texto multilinha.
   - **JCheckBox**: Uma caixa de seleção.
   - **JRadioButton**: Um botão de seleção de escolha única.
   - **JComboBox**: Uma caixa de seleção suspensa.
   - **JList**: Uma lista de itens.
   - **JTable**: Uma tabela para exibir dados em grade.

6. **LayoutManager**: É uma interface que define como os componentes são organizados dentro de um contêiner. O Swing oferece vários gerenciadores de layout predefinidos, como `FlowLayout`, `BorderLayout`, `GridLayout` e `GridBagLayout`, que permitem controlar o posicionamento e o dimensionamento dos componentes.

7. **Event Handling**: A hierarquia de componentes também inclui classes relacionadas a eventos, como `ActionEvent`, `MouseListener` e `ActionListener`, que permitem responder a interações do usuário, como cliques de mouse e pressionamentos de tecla.

8. **Renderização**: Classes como `Graphics` e `Graphics2D` são usadas para personalizar a renderização dos componentes, permitindo a criação de interfaces gráficas personalizadas.

9. **LookAndFeel**: O Swing oferece a capacidade de personalizar a aparência de aplicativos usando Look and Feels (L&Fs). L&Fs controlam a aparência e o estilo dos componentes Swing, permitindo que você escolha entre aparências diferentes, como Metal, Nimbus e Windows.

Em resumo, a hierarquia de componentes do Java Swing fornece uma estrutura organizada para criar interfaces gráficas de usuário ricas e interativas em aplicativos de desktop Java. Os desenvolvedores podem usar uma combinação desses componentes e gerenciadores de layout para projetar interfaces de usuário complexas e funcionais.

Exemplo prático que utiliza vários componentes do Java Swing para criar uma aplicação simples de cadastro de clientes. Este exemplo abrange a criação de uma janela principal (`JFrame`) com campos de entrada de texto (`JTextField`), rótulos (`JLabel`), botões (`JButton`) e uma lista de clientes (`JList`).

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroClientesApp {
    public static void main(String[] args) {
        // Cria uma instância da janela principal
        JFrame frame = new JFrame("Cadastro de Clientes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Cria um painel para organizar os componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10)); // Layout de grade 4x2

        // Cria rótulos
        JLabel nameLabel = new JLabel("Nome:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel phoneLabel = new JLabel("Telefone:");

        // Cria campos de entrada de texto
        JTextField nameTextField = new JTextField();
        JTextField emailTextField = new JTextField();
        JTextField phoneTextField = new JTextField();

        // Cria um botão para adicionar cliente
        JButton addButton = new JButton("Adicionar Cliente");

        // Cria uma lista de clientes
        DefaultListModel<String> clientListModel = new DefaultListModel<>();
        JList<String> clientList = new JList<>(clientListModel);

        // Adiciona os componentes ao painel
        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(emailLabel);
        panel.add(emailTextField);
        panel.add(phoneLabel);
        panel.add(phoneTextField);
        panel.add(addButton);

        // Define o comportamento do botão de adição de cliente
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String email = emailTextField.getText();
                String phone = phoneTextField.getText();
                String clientInfo = name + " | " + email + " | " + phone;
                clientListModel.addElement(clientInfo);
                // Limpa os campos de entrada
                nameTextField.setText("");
                emailTextField.setText("");
                phoneTextField.setText("");
            }
        });

        // Cria uma barra de rolagem para a lista de clientes
        JScrollPane scrollPane = new JScrollPane(clientList);

        // Adiciona o painel e a lista de clientes à janela principal
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Exibe a janela
        frame.setVisible(true);
    }
}
```
# 2# Camadas
Neste exemplo, você verá a criação de uma janela principal com campos de entrada de texto para o nome, e-mail e telefone do cliente. Quando o botão "Adicionar Cliente" é clicado, as informações do cliente são adicionadas a uma lista na parte inferior. A lista utiliza uma barra de rolagem para lidar com muitos clientes.

Lembrando que este é um exemplo muito simples e não inclui validações ou persistência de dados. Ele serve como um ponto de partida para entender como os componentes Swing são usados para criar interfaces gráficas de usuário em aplicativos Java.

O Java Swing é uma biblioteca gráfica que faz parte do Java Foundation Classes (JFC) e é usada para criar interfaces gráficas de usuário (GUIs) em aplicativos Java. As camadas no Java Swing se referem ao conceito de hierarquia de componentes ou contêineres que são usados para construir interfaces gráficas. Essas camadas ajudam a organizar e estruturar os elementos da GUI de maneira eficaz. Aqui estão as principais camadas no Java Swing:

1. **Camada de Conteúdo (Content Layer):**
   - A camada mais baixa da hierarquia é a camada de conteúdo, que representa os componentes gráficos individuais, como botões, caixas de texto, rótulos e outros elementos de interface.
   - Os componentes nessa camada são responsáveis por interagir diretamente com o usuário e exibir informações ou receber entrada.

2. **Camada de Contêiner (Container Layer):**
   - Acima da camada de conteúdo está a camada de contêiner, que consiste em componentes que podem conter outros componentes.
   - Exemplos de contêineres incluem JPanel, JFrame e JDialog. Eles são usados para organizar e agrupar componentes relacionados em uma GUI.
   - Os contêineres ajudam a definir a estrutura geral da interface do usuário e a organizar os elementos visuais de maneira hierárquica.

3. **Camada de Layout (Layout Layer):**
   - A camada de layout é responsável por determinar como os componentes são posicionados e redimensionados dentro de um contêiner.
   - LayoutManagers são usados nesta camada para controlar o layout dos componentes. Alguns exemplos de LayoutManagers incluem BorderLayout, GridLayout e FlowLayout.
   - Os LayoutManagers ajudam a garantir que os componentes se ajustem automaticamente ao tamanho do contêiner e à resolução da tela.

4. **Camada de Janela (Window Layer):**
   - A camada de janela representa as janelas de nível superior em um aplicativo Swing, como JFrame e JDialog.
   - As janelas são usadas para criar a interface principal do aplicativo e geralmente contêm vários contêineres e componentes.
   - A camada de janela lida com eventos de janela, como redimensionamento, minimização e fechamento.

5. **Camada de Aplicação (Application Layer):**
   - Esta é a camada mais alta e representa a lógica de aplicação subjacente que controla o comportamento dos componentes e a interação com o usuário.
   - A camada de aplicação é responsável por definir como os componentes reagem a eventos e como os dados são processados.

Em resumo, as camadas no Java Swing fornecem uma estrutura organizacional para a criação de interfaces gráficas de usuário complexas e flexíveis. Os componentes individuais são organizados em contêineres que são gerenciados por LayoutManagers, e as janelas de nível superior são usadas para criar a interface principal do aplicativo. A camada de aplicação controla a lógica do aplicativo e a interação com o usuário. Essa estrutura modular ajuda os desenvolvedores a criar GUIs eficazes e bem organizadas em aplicativos Java Swing.

Exemplo prático:
Aplicação Java Swing que abrange todas as camadas mencionadas: camada de conteúdo, camada de contêiner, camada de layout, camada de janela e camada de aplicação. Neste exemplo, criaremos uma simples calculadora GUI.

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSwing {
    public static void main(String[] args) {
        // Camada de Aplicação
        SwingUtilities.invokeLater(() -> {
            criarGUI();
        });
    }

    private static void criarGUI() {
        // Camada de Janela
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        // Camada de Contêiner
        JPanel panel = new JPanel();
        frame.add(panel);

        // Camada de Layout
        panel.setLayout(new GridLayout(5, 4));

        // Camada de Conteúdo
        JTextField visor = new JTextField();
        visor.setEditable(false);
        panel.add(visor);

        String[] botoes = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String botao : botoes) {
            JButton button = new JButton(botao);
            panel.add(button);

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String textoBotao = ((JButton) e.getSource()).getText();
                    String textoVisor = visor.getText();

                    if (textoBotao.equals("=")) {
                        try {
                            // Avaliar a expressão matemática
                            ScriptEngineManager mgr = new ScriptEngineManager();
                            ScriptEngine engine = mgr.getEngineByName("JavaScript");
                            Object resultado = engine.eval(textoVisor);
                            visor.setText(resultado.toString());
                        } catch (Exception ex) {
                            visor.setText("Erro");
                        }
                    } else {
                        visor.setText(textoVisor + textoBotao);
                    }
                }
            });
        }

        // Exibir a janela
        frame.setVisible(true);
    }
}
```

Este exemplo cria uma calculadora Swing com uma interface de usuário que inclui todas as camadas mencionadas:

- Camada de Conteúdo: O visor de texto é o componente de conteúdo onde os números e operadores são exibidos.
- Camada de Contêiner: O painel é usado para conter todos os botões.
- Camada de Layout: O GridLayout é usado para organizar os botões em uma grade.
- Camada de Janela: A janela JFrame é a janela de nível superior que contém o painel.
- Camada de Aplicação: A lógica da calculadora é implementada na camada de aplicação, onde os eventos dos botões são tratados e as operações matemáticas são avaliadas usando um mecanismo de script.

Execute este código Java Swing e você terá uma calculadora simples com todas as camadas demonstradas.

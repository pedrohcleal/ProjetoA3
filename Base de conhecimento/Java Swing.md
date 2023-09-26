# Java Swing

O Java Swing é uma biblioteca de componentes gráficos (GUI - Graphical User Interface) para a linguagem de programação Java. Ele foi desenvolvido pela Sun Microsystems (agora parte da Oracle Corporation) como uma alternativa ao AWT (Abstract Window Toolkit) original, que era limitado em termos de recursos e aparência. O Swing foi introduzido na versão 1.2 do Java e tornou-se a biblioteca padrão para a criação de interfaces gráficas em Java.

Aqui estão algumas características e conceitos-chave relacionados ao Java Swing:

1. **Componentes Gráficos:** O Swing fornece uma ampla variedade de componentes gráficos, como botões, caixas de texto, rótulos, caixas de seleção, listas, tabelas e muito mais. Esses componentes são altamente personalizáveis e podem ser usados para criar interfaces de usuário ricas.

2. **Look and Feel (Aparência e Comportamento):** Uma das características mais importantes do Swing é a capacidade de definir o "look and feel" da interface do usuário. Isso significa que você pode personalizar a aparência e o comportamento dos componentes para se adequarem ao estilo do sistema operacional em que o aplicativo está sendo executado.

3. **Eventos e Listeners:** O Swing utiliza o modelo de eventos e ouvintes (listeners) para lidar com interações do usuário. Você pode registrar ouvintes para responder a ações do usuário, como clicar em um botão ou digitar texto em um campo de texto.

4. **Thread de Eventos:** O Swing opera em uma thread separada chamada "Event Dispatch Thread" (EDT), que é responsável por lidar com eventos de interface do usuário. Isso garante que as interações do usuário sejam tratadas de forma assíncrona, mantendo a interface responsiva.

5. **Layout Managers:** Para organizar os componentes em uma janela ou painel, o Swing utiliza gerenciadores de layout (layout managers). Esses gerenciadores controlam como os componentes são posicionados e redimensionados quando a janela é redimensionada.

6. **Janelas e Painéis:** As janelas (JFrame) e painéis (JPanel) são contêineres usados para organizar os componentes. As janelas representam as janelas da aplicação, enquanto os painéis podem ser usados para agrupar componentes relacionados.

7. **Swing Worker:** Para realizar tarefas demoradas em segundo plano sem bloquear a EDT, o Swing fornece a classe SwingWorker. Isso é útil para evitar que a interface do usuário fique inativa durante operações intensivas de processamento.

8. **Arrastar e Soltar:** O Swing oferece suporte a recursos de arrastar e soltar, permitindo que os usuários arrastem elementos e os soltem em locais específicos da interface.

9. **Internacionalização e Localização:** O Swing também oferece suporte à internacionalização e localização, o que facilita a criação de aplicativos que podem ser adaptados para diferentes idiomas e regiões.

Em resumo, o Java Swing é uma poderosa biblioteca para a criação de interfaces gráficas em Java, permitindo que os desenvolvedores criem aplicativos de desktop visualmente atraentes e interativos. É amplamente utilizado em aplicações de desktop Java, embora tenha enfrentado concorrência de outras tecnologias mais modernas, como JavaFX, nos últimos anos.

## Camadas

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
## Frames

Em Java Swing, as "frames" são janelas ou contêineres de nível superior que são usados para criar interfaces gráficas de usuário (GUIs). As frames são uma parte fundamental do desenvolvimento de aplicativos Swing, pois fornecem a estrutura principal para a organização de componentes gráficos, como botões, caixas de texto, rótulos e outros widgets, em uma interface de usuário interativa.

A classe `javax.swing.JFrame` é usada para criar frames em Java Swing. Aqui estão algumas características e conceitos importantes relacionados às frames no Java Swing:

1. **JFrame**: A classe `JFrame` é uma subclasse da classe `java.awt.Frame` e estende-a para fornecer funcionalidades específicas para GUIs Swing. Você pode criar uma instância de `JFrame` para criar uma janela gráfica na qual você pode adicionar componentes Swing.

2. **Layout Manager**: As frames geralmente usam gerenciadores de layout (layout managers) para organizar e posicionar os componentes dentro delas. Alguns dos gerenciadores de layout comuns incluem `FlowLayout`, `BorderLayout`, `GridLayout` e `GridBagLayout`. Eles ajudam a garantir que os componentes sejam dispostos de maneira adequada e responsiva.

3. **Componentes**: As frames geralmente contêm uma variedade de componentes, como botões, rótulos, campos de texto, listas e muito mais. Esses componentes são adicionados à frame usando os métodos apropriados, como `add()`. Cada componente é colocado em um contêiner que é, por sua vez, colocado na frame.

4. **Eventos**: As frames podem responder a eventos gerados pelos componentes, como cliques de botões, entrada de teclado, movimento do mouse, etc. Isso é feito registrando ou associando ouvintes de eventos (event listeners) aos componentes relevantes.

5. **Título e Dimensões**: Você pode definir o título da frame usando o método `setTitle()` e especificar suas dimensões usando métodos como `setSize()` ou `pack()`.

6. **Visibilidade**: É importante chamar o método `setVisible(true)` para tornar a frame visível quando ela estiver pronta para ser exibida na tela.

7. **Fechamento**: Você pode controlar o comportamento de fechamento da frame, como ocultá-la ou encerrar o programa quando a frame é fechada, usando métodos como `setDefaultCloseOperation()`.

Aqui está um exemplo simples de como criar e exibir uma frame em Java Swing:

```java
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinhaFrameSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Primeira Frame");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Olá, Mundo!");
        frame.add(label);

        frame.setVisible(true);
    }
}
```

Este é apenas um exemplo básico para demonstrar a criação de uma frame em Java Swing. À medida que você se aprofunda no desenvolvimento de GUIs Swing, poderá adicionar mais componentes, configurar layouts personalizados e lidar com eventos para criar interfaces de usuário mais interativas e complexas.

## Métodos mais utilizados nos frames

A classe `javax.swing.JFrame` possui muitos métodos que permitem configurar e interagir com a frame em uma interface gráfica Swing. Aqui estão alguns dos métodos mais comuns em relação a uma frame:

1. **`setTitle(String title)`**: Define o título da frame que aparece na barra de título da janela.

2. **`setSize(int width, int height)`**: Define as dimensões da frame em pixels (largura e altura).

3. **`setDefaultCloseOperation(int operation)`**: Define o comportamento de fechamento da frame quando o botão de fechar é clicado. Você pode usar constantes como `JFrame.EXIT_ON_CLOSE`, `JFrame.DISPOSE_ON_CLOSE`, `JFrame.HIDE_ON_CLOSE` e outras.

4. **`setVisible(boolean visible)`**: Define se a frame é visível ou não. Use `true` para torná-la visível e `false` para ocultá-la.

5. **`setResizable(boolean resizable)`**: Permite ou impede que o usuário redimensione a frame.

6. **`setLayout(LayoutManager manager)`**: Define o gerenciador de layout para organizar os componentes dentro da frame.

7. **`add(Component comp)`**: Adiciona um componente à frame. Este método é usado para colocar outros componentes (como botões, rótulos, etc.) dentro da frame.

8. **`remove(Component comp)`**: Remove um componente da frame.

9. **`pack()`**: Ajusta automaticamente o tamanho da frame para acomodar todos os seus componentes, com base nas preferências de layout.

10. **`setLocation(int x, int y)`**: Define a posição da frame na tela, em pixels a partir do canto superior esquerdo.

11. **`setLocationRelativeTo(Component c)`**: Define a posição da frame em relação a outro componente. Útil para centralizar a frame em relação a um componente específico.

12. **`setIconImage(Image image)`**: Define o ícone da frame, que aparece na barra de título e na barra de tarefas (quando minimizada).

13. **`toFront()`**: Coloca a frame na frente de todas as outras janelas.

14. **`toBack()`**: Coloca a frame atrás de todas as outras janelas.

15. **`setAlwaysOnTop(boolean always)`**: Define se a frame deve estar sempre no topo de outras janelas.

16. **`setExtendedState(int state)`**: Define o estado estendido da frame (normal, maximizado, minimizado, etc.).

17. **`setJMenuBar(JMenuBar menubar)`**: Define a barra de menu da frame.

18. **`getContentPane()`**: Retorna o painel de conteúdo da frame, onde os componentes são adicionados.

19. **`validate()`**: Força a validação de todos os componentes na frame, o que pode ser útil após alterações no layout.

20. **`repaint()`**: Solicita uma repintura da frame.

Estes são alguns dos métodos mais comuns associados à classe `JFrame`. Lembre-se de que a documentação oficial do Java e tutoriais específicos podem fornecer mais detalhes sobre cada método e seu uso.

## Labels

No Java Swing, as "labels" geralmente se referem aos componentes gráficos usados para exibir texto ou ícones em uma interface gráfica de usuário (GUI). As labels são usadas para fornecer informações, rótulos ou descrições em um aplicativo Swing. Elas são representadas pela classe `JLabel` e são uma parte fundamental na criação de interfaces de usuário amigáveis e informativas. Vamos explorar em detalhes como usar labels no Java Swing:

1. **Importação de Pacotes**:
   Certifique-se de que você importe os pacotes necessários no seu arquivo Java para poder usar a classe `JLabel`. Normalmente, você precisará das seguintes importações:

   ```java
   import javax.swing.JFrame;
   import javax.swing.JLabel;
   import javax.swing.JPanel;
   ```

2. **Criação de uma JLabel**:
   Para criar uma label, você precisa instanciar a classe `JLabel`. Você pode especificar o texto ou o ícone que deseja exibir na label durante a criação. Aqui estão alguns exemplos:

   - Criando uma label com texto:
     ```java
     JLabel label = new JLabel("Isso é uma label.");
     ```

   - Criando uma label com um ícone:
     ```java
     ImageIcon icon = new ImageIcon("caminho/para/seu/icone.png");
     JLabel label = new JLabel(icon);
     ```

3. **Configuração de Propriedades**:
   Você pode configurar várias propriedades de uma label, como fonte, cor de texto, alinhamento, entre outras. Aqui estão alguns exemplos:

   - Alterando a fonte do texto:
     ```java
     label.setFont(new Font("Arial", Font.BOLD, 16));
     ```

   - Definindo a cor do texto:
     ```java
     label.setForeground(Color.BLUE);
     ```

   - Alinhando o texto:
     ```java
     label.setHorizontalAlignment(JLabel.CENTER); // Alinha o texto no centro horizontalmente
     ```

4. **Adição ao Contêiner**:
   Para exibir uma label em sua interface gráfica, você deve adicioná-la a um contêiner Swing, como um `JFrame`, um `JPanel`, entre outros. Por exemplo:

   ```java
   JFrame frame = new JFrame("Exemplo de Label");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   JPanel panel = new JPanel();
   panel.add(label);

   frame.add(panel);
   frame.pack();
   frame.setVisible(true);
   ```

5. **Tratamento de Eventos**:
   Em alguns casos, você pode adicionar tratamento de eventos a uma label. Por exemplo, você pode adicionar um ouvinte de clique para responder a eventos de clique do mouse na label.

   ```java
   label.addMouseListener(new MouseAdapter() {
       @Override
       public void mouseClicked(MouseEvent e) {
           // Lógica a ser executada quando a label for clicada
       }
   });
   ```

6. **Atualização de Conteúdo**:
   Você pode atualizar o conteúdo de uma label em tempo de execução chamando métodos como `setText()` para alterar o texto exibido ou `setIcon()` para alterar o ícone.

   ```java
   label.setText("Novo texto na label");
   ```

Essas são as principais informações sobre o uso de labels no Java Swing. Elas são muito úteis para exibir informações, rótulos e elementos gráficos em interfaces de usuário Swing. Você pode personalizar as labels de acordo com suas necessidades específicas para criar interfaces de usuário interativas e informativas.

## Métodos JLabel

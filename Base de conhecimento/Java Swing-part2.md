# Java Swing - part2

## Buttons 

Os botões são elementos de interface gráfica de usuário (GUI) essenciais em aplicativos Java Swing. Eles são usados para permitir que os usuários interajam com o programa, clicando neles para realizar ações específicas. No Java Swing, você pode criar botões usando a classe `JButton`, que faz parte do pacote `javax.swing`.

Aqui estão alguns conceitos e recursos importantes relacionados aos botões no Java Swing:

1. **Criando um JButton**:
   Para criar um botão, você instancia um objeto da classe `JButton` e fornece um rótulo de texto que será exibido no botão. Por exemplo:
   
   ```java
   JButton meuBotao = new JButton("Clique-me");
   ```

2. **Eventos de Ação**:
   Os botões são usados para desencadear ações quando são clicados. Para responder a um clique de botão, você precisa registrar um ouvinte de evento de ação (geralmente uma classe que implementa a interface `ActionListener`) e implementar o método `actionPerformed` para definir o comportamento desejado quando o botão é clicado.

   ```java
   meuBotao.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
           // Lógica a ser executada quando o botão for clicado
       }
   });
   ```

3. **Ícones em Botões**:
   Além de rótulos de texto, você também pode adicionar ícones aos botões usando a classe `ImageIcon`. Isso é útil quando você deseja criar botões com ícones em vez de texto.

   ```java
   ImageIcon icone = new ImageIcon("icone.png");
   JButton botaoComIcone = new JButton(icone);
   ```

4. **Estilos e Aparência**:
   Você pode personalizar a aparência dos botões ajustando propriedades como cor de fundo, cor do texto, fonte, bordas e muito mais. Isso é feito usando os métodos apropriados da classe `JButton`.

5. **Botões de Alternância**:
   Além dos botões simples, você pode criar botões de alternância usando a classe `JToggleButton`. Esses botões podem alternar entre um estado pressionado e um estado não pressionado quando clicados.

6. **Grupos de Botões de Alternância**:
   Você pode agrupar botões de alternância para que apenas um deles possa estar no estado pressionado de cada vez. Isso é feito usando objetos `ButtonGroup`.

7. **Atalhos de Teclado**:
   É possível associar atalhos de teclado a botões usando a classe `KeyStroke` e a classe `InputMap`. Isso permite que os usuários ativem um botão pressionando uma combinação de teclas.

8. **Dicas de Ferramentas (Tooltips)**:
   Você pode adicionar dicas de ferramentas aos botões para fornecer informações adicionais quando o mouse é colocado sobre o botão. Isso é feito usando o método `setToolTipText`.

9. **Estado de Ativação e Desativação**:
   Você pode ativar ou desativar um botão usando o método `setEnabled(boolean)` para impedir que os usuários interajam com ele temporariamente.

No geral, os botões são componentes GUI versáteis e amplamente utilizados em aplicativos Java Swing para criar interfaces de usuário interativas e responsivas. Eles podem ser personalizados de acordo com as necessidades do seu aplicativo e podem ser combinados com outros componentes Swing para criar interfaces ricas e funcionais.

### Métodos em Jbuttons

A classe `JButton` em Java Swing possui diversos métodos que permitem configurar, personalizar e interagir com botões em uma interface gráfica de usuário. Abaixo, estão alguns dos métodos mais comuns da classe `JButton`:

1. **`setText(String text)`**:
   Este método define o texto exibido no botão.

   ```java
   JButton meuBotao = new JButton();
   meuBotao.setText("Clique-me");
   ```

2. **`getText()`**:
   Retorna o texto atualmente exibido no botão.

   ```java
   String textoDoBotao = meuBotao.getText();
   ```

3. **`setIcon(Icon icon)`**:
   Permite definir um ícone para o botão.

   ```java
   ImageIcon icone = new ImageIcon("icone.png");
   meuBotao.setIcon(icone);
   ```

4. **`setMnemonic(int mnemonic)`**:
   Define uma tecla de atalho (mnemônico) para o botão. Quando a tecla mnemônica é pressionada em combinação com a tecla "Alt", o botão é acionado.

   ```java
   meuBotao.setMnemonic(KeyEvent.VK_C);
   ```

5. **`setToolTipText(String text)`**:
   Adiciona uma dica de ferramenta (tooltip) que é exibida quando o mouse paira sobre o botão.

   ```java
   meuBotao.setToolTipText("Clique para realizar uma ação");
   ```

6. **`addActionListener(ActionListener listener)`**:
   Registra um ouvinte de ação que será notificado quando o botão for clicado. O método `actionPerformed` do ouvinte será chamado quando o botão for acionado.

   ```java
   meuBotao.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
           // Lógica a ser executada quando o botão for clicado
       }
   });
   ```

7. **`setEnabled(boolean enabled)`**:
   Define se o botão está habilitado (clicável) ou desabilitado (não clicável).

   ```java
   meuBotao.setEnabled(false); // Desabilita o botão
   ```

8. **`setBorder(Border border)`**:
   Permite definir a borda do botão, o que pode afetar sua aparência visual.

   ```java
   meuBotao.setBorder(BorderFactory.createLineBorder(Color.RED));
   ```

9. **`setBackground(Color bg)`**:
   Define a cor de fundo do botão.

   ```java
   meuBotao.setBackground(Color.BLUE);
   ```

10. **`setForeground(Color fg)`**:
    Define a cor do texto do botão.

    ```java
    meuBotao.setForeground(Color.WHITE);
    ```

Esses são alguns dos métodos mais comuns que você pode usar ao trabalhar com botões `JButton` em Java Swing. Eles permitem personalizar a aparência, comportamento e interatividade dos botões em sua aplicação GUI.

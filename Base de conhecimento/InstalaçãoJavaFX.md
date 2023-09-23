# Como instalar

## INTELIJ

Para instalar o JavaFX no IntelliJ IDEA, você pode seguir os passos abaixo. Certifique-se de que você já tenha o IntelliJ IDEA instalado e configurado para desenvolvimento Java. Além disso, verifique se você tem o JDK (Java Development Kit) instalado em seu sistema.

1. **Baixe o JavaFX SDK:**
   Primeiro, você precisa baixar o JavaFX SDK. Você pode fazer isso acessando o site oficial do OpenJFX (JavaFX) em [https://openjfx.io/](https://openjfx.io/) e clicando no link "Download JavaFX SDK". Selecione a versão do JavaFX que corresponda à sua versão do JDK.

2. **Descompacte o JavaFX SDK:**
   Após o download, descompacte o arquivo em um local de sua escolha no seu sistema. Lembre-se do caminho para o diretório do JavaFX SDK, pois você precisará dele posteriormente.

3. **Abra o IntelliJ IDEA:**
   Inicie o IntelliJ IDEA se ele ainda não estiver aberto.

4. **Crie ou abra um projeto Java:**
   Você pode criar um novo projeto Java ou abrir um projeto existente no IntelliJ IDEA, dependendo do que você está desenvolvendo.

5. **Configure o SDK do Projeto:**
   Vá para "File" (Arquivo) -> "Project Structure" (Estrutura do Projeto).

6. **Configurar o SDK do Projeto:**
   - Na janela "Project Structure", selecione "Project" no lado esquerdo.
   - No campo "Project SDK", verifique se você selecionou a versão correta do JDK para o seu projeto.

7. **Adicione o JavaFX SDK como uma biblioteca:**
   - Ainda na janela "Project Structure", selecione "Libraries" no lado esquerdo.
   - Clique no botão "+" para adicionar uma nova biblioteca.
   - Escolha "Java" e forneça um nome para a biblioteca (por exemplo, "JavaFX").
   - Clique em "Next".
   - Clique em "Specify" e navegue até a pasta onde você descompactou o JavaFX SDK no passo 2.
   - Selecione a pasta "lib" dentro do diretório do JavaFX SDK.
   - Clique em "Finish" para adicionar a biblioteca.

8. **Configure a biblioteca JavaFX no módulo do seu projeto:**
   - Ainda na janela "Project Structure", selecione "Modules" no lado esquerdo.
   - Selecione o módulo do seu projeto.
   - Na guia "Dependencies", clique no botão "+".
   - Escolha "Module Dependency" e selecione a biblioteca JavaFX que você criou no passo 7.
   - Clique em "OK".

9. **Conclua a configuração do JavaFX:**
   - No código-fonte do seu projeto, você pode importar classes JavaFX normalmente e começar a desenvolver aplicativos JavaFX.

Lembrando que, dependendo da versão do IntelliJ IDEA e do JavaFX, os passos e menus podem variar ligeiramente, mas a essência do processo permanece a mesma. Certifique-se de estar usando as versões compatíveis do JavaFX e do JDK para evitar problemas de compatibilidade.

## Eclipse

Para instalar o JavaFX no Eclipse, você pode seguir os seguintes passos:

**Observação:** Certifique-se de que você já tenha o Eclipse IDE instalado e configurado corretamente em seu sistema antes de começar.

1. **Verifique os pré-requisitos:**
   Antes de começar, verifique se você tem o Java Development Kit (JDK) instalado em seu sistema. O JavaFX é uma biblioteca que acompanha o JDK desde o Java 8u40. Certifique-se de que você tenha uma versão do JDK igual ou superior a essa.

2. **Abra o Eclipse:**
   Inicie o Eclipse IDE.

3. **Crie ou abra um projeto Java:**
   Você pode criar um novo projeto Java ou usar um projeto Java existente. Selecione "File" (Arquivo) > "New" (Novo) > "Java Project" (Projeto Java) para criar um novo projeto ou selecione um projeto existente.

4. **Configurar o Build Path:**
   Para adicionar o JavaFX ao projeto, você precisa configurar o Build Path. Clique com o botão direito no projeto no "Project Explorer" (Explorador de Projetos) e selecione "Build Path" (Caminho de Compilação) > "Configure Build Path" (Configurar Caminho de Compilação).

5. **Adicione as bibliotecas do JavaFX:**
   Na guia "Libraries" (Bibliotecas), clique em "Classpath" (Caminho de Classes) e depois em "Add Library" (Adicionar Biblioteca). Escolha "User Library" (Biblioteca de Usuário) e clique em "Next" (Avançar).

6. **Criar uma nova biblioteca do JavaFX:**
   Clique em "User Libraries" (Bibliotecas de Usuário) e, em seguida, clique em "New" (Novo). Dê um nome à sua biblioteca (por exemplo, "JavaFX") e clique em "OK".

7. **Adicione os JARs do JavaFX:**
   Selecione a biblioteca JavaFX que você acabou de criar e clique em "Add External JARs" (Adicionar JARs Externos). Navegue até a pasta de instalação do JavaFX em seu sistema e selecione os JARs relevantes. Esses JARs geralmente estão localizados na pasta `lib` do diretório de instalação do JavaFX. Certifique-se de incluir, pelo menos, `javafx.base.jar`, `javafx.graphics.jar`, e `javafx.controls.jar`. Clique em "OK" para adicionar os JARs.

8. **Aplicar configurações:**
   Clique em "Finish" (Concluir) para criar a biblioteca JavaFX.

9. **Aplicar biblioteca ao projeto:**
   Com a biblioteca JavaFX selecionada na guia "Libraries" (Bibliotecas), clique em "Finish" (Concluir) novamente para aplicar a biblioteca ao seu projeto.

10. **Configurar o módulo JavaFX (apenas para projetos Java 9 ou superior):**
    Se você estiver usando uma versão do Java 9 ou superior, será necessário configurar o módulo JavaFX em seu projeto. Para fazer isso, vá para o arquivo `module-info.java` em seu projeto e adicione as seguintes linhas:

    ```java
    module SeuModulo {
        requires javafx.controls;
        requires javafx.fxml;
        // Outros módulos JavaFX, se necessário
    }
    ```

11. **Desenvolva sua aplicação JavaFX:**
    Agora você está pronto para começar a desenvolver sua aplicação JavaFX dentro do Eclipse. Você pode criar interfaces gráficas e usar todas as funcionalidades do JavaFX em seu projeto.

Lembre-se de que a configuração do JavaFX pode variar dependendo da versão do Eclipse e do JDK que você está usando. Certifique-se de consultar a documentação relevante e fazer as adaptações necessárias, se necessário, para a versão específica que você está usando.

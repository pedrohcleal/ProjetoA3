# BookHub

## Visão Geral
O BookHub é uma aplicação para desktop com uma interface gráfica e um banco de dados SQL como backend. Foi desenvolvido para gerenciar contas de usuário e fornecer acesso a várias funcionalidades. Este Readme fornece uma visão geral do projeto, incluindo as tecnologias usadas e instruções para configurar e executar a aplicação.

## Funcionalidades
- Autenticação de Usuários: Os usuários podem fazer login com suas credenciais, e o sistema distingue entre usuários regulares e administradores.
- Registro de Usuários: Novos usuários podem se registrar no sistema fornecendo informações essenciais.
- Acesso de Administrador: Os administradores têm acesso a funcionalidades adicionais para gerenciar usuários e o sistema.

## Tecnologias Utilizadas
- **Linguagem de Programação:** Java
- **Framework de GUI:** Java Swing
- **Banco de Dados:** SQL
- **IDE:** NetBeans

## Como Começar
Siga essas etapas para configurar e executar a aplicação BookHub em sua máquina local:

1. **Clonar o Repositório:** Comece clonando o repositório do BookHub em sua máquina local:

   ```bash
   git clone https://github.com/seunome/BookHub.git
   ```

2. **Abrir o Projeto:** Abra o projeto no NetBeans IDE. Você pode precisar configurar as configurações do Java Swing e do banco de dados de acordo com o seu ambiente.

3. **Configuração do Banco de Dados:**
   - Certifique-se de ter o MySQL instalado em sua máquina local ou em um servidor remoto.
   - Crie um banco de dados com o nome `bd-bookhub`.
   - Atualize as configurações de conexão do banco de dados na classe `DatabaseUtil`:
     - `DB_URL`: Atualize com a URL do seu banco de dados.
     - `DB_USER`: Defina o nome de usuário do banco de dados.
     - `DB_PASS`: Defina a senha do banco de dados.

4. **Executar a Aplicação:** Construa e execute o projeto BookHub no NetBeans.

5. **Login:**
   - Use o código fornecido para a tela de login para testar a autenticação de usuários.
   - Você pode registrar novos usuários e diferenciar entre contas de usuário e administrador.

6. **Personalização:**
   - Você pode modificar o código da aplicação para adicionar mais funcionalidades ou adaptá-lo às suas necessidades específicas.

## Colaboradores
- [Seu Nome](https://github.com/seunome)

## Licença
Este projeto é licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para obter mais detalhes.

## Agradecimentos
Obrigado por usar o BookHub. Esperamos que esta aplicação seja uma ferramenta valiosa para suas necessidades. Se você encontrar problemas ou tiver sugestões de melhorias, sinta-se à vontade para contribuir para o projeto ou entrar em contato com os colaboradores.

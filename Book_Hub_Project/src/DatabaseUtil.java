import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/bd-bookhub";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";
    private Connection conexao;
    
    //Checa login- user e senha
    public static boolean checkLogin(String username, String password, String typeUser) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String sql = "SELECT * FROM allusers WHERE nome = ? AND senha = ? AND Tipo_de_usuário = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, typeUser);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                connection.close();
                return true;
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    
//Adicionar usuário no BD
 public static boolean addUser(String username, String senha, String idade, String sexo, String LP1, String LP2) {
    try {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                
        // insira os valores na tabela clientusers
        String sqlAllUsers = "INSERT INTO allusers (Nome, Senha, Sexo, Idade, LP1, LP2, Tipo_de_usuário) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement AllUsers = connection.prepareStatement(sqlAllUsers);
        AllUsers.setString(1, username);
        AllUsers.setString(2, senha);
        AllUsers.setString(3, sexo);
        AllUsers.setString(4, idade);
        AllUsers.setString(5, LP1);
        AllUsers.setString(6, LP2);
        AllUsers.setString(7, "user");

        
        int rowsAffectedClientUsers = AllUsers.executeUpdate();
        connection.close();
        // Verifique se ambas as inserções foram bem-sucedidas
        return rowsAffectedClientUsers > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}


//Remover usuário no BD
 public static boolean removeUser(String username, String idade, String sexo, String lp1, String lp2) {
    try {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        
        String sql = "DELETE FROM users WHERE nome = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, username);
        preparedStatement.setString(3, username);
        preparedStatement.setString(4, username);
        preparedStatement.setString(5, username);

        int rowsAffected = preparedStatement.executeUpdate();

        connection.close();

        return rowsAffected > 0; // Retorna verdadeiro se pelo menos uma linha foi afetada (usuário removido com sucesso)
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
 }

public static Connection conectar() {
    try {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    } catch (SQLException e) {
        e.printStackTrace();
        return null;
    }
    }
}
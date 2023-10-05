import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/bd-bookhub";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";
    
    //Checa login- user e senha
    public static boolean checkLogin(String username, String password) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String sql = "SELECT * FROM allusers WHERE nome = ? AND senha = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

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
 public static boolean addUser(String username, String idade, String sexo, String lp1, String lp2) {
    try {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

        String sql = "INSERT INTO clientusers (nome, idade, sexo, LP1, LP2) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, username);
        preparedStatement.setString(3, username);
        preparedStatement.setString(4, username);
        preparedStatement.setString(5, username);

        int rowsAffected = preparedStatement.executeUpdate();

        connection.close();

        return rowsAffected > 0; // Retorna verdadeiro se pelo menos uma linha foi afetada (usuário adicionado com sucesso)
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

 
   
}
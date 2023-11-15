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
    public static boolean checkLogin(int iduser, String password) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String sql = "SELECT * FROM allusers WHERE ID = ? AND senha = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, iduser);
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
    //Retornar tipo de usuário
    public static String checkTypeUser(int iduser, String password) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String sql = "SELECT * FROM allusers WHERE ID = ? AND senha = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, iduser);
            preparedStatement.setString(2, password);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String userType = resultSet.getString("Tipo_de_usuário");
                connection.close();
                return userType;
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    //Retornar nome do usuario
    public static String returnName(int iduser) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String sql = "SELECT * FROM allusers WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, iduser);
                        
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String userName = resultSet.getString("Nome");
                connection.close();
                return userName;
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
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
    public static boolean removeUser(int ID) {
       try {
           Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

           String sql = "DELETE FROM allusers WHERE ID = ?";
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setInt(1, ID);
           
           int rowsAffected = preparedStatement.executeUpdate();

           connection.close();

           return rowsAffected > 0; // Retorna verdadeiro se pelo menos uma linha foi afetada (usuário removido com sucesso)
       } catch (SQLException e) {
           e.printStackTrace();
           return false;
       }
    }
    //Adicionar livros no bd
    public static boolean addBook(String titulo, String autor, String tipo, int nota, int ID) {
       try {
           Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

           // insira os valores na tabela clientusers
           String sqlAllUsers = "INSERT INTO livros (titulo, autor, tipo, nota_cliente, iduser)"
                   + " VALUES (?, ?, ?, ?, ?)";
           
           PreparedStatement addBook = connection.prepareStatement(sqlAllUsers);
           addBook.setString(1, titulo);
           addBook.setString(2, autor);
           addBook.setString(3, tipo);
           addBook.setInt(4, nota);
           addBook.setInt(5, ID);
           
           int rowsAffectedClientUsers = addBook.executeUpdate();
           connection.close();
           // Verifique se ambas as inserções foram bem-sucedidas
           return rowsAffectedClientUsers > 0;
       } catch (SQLException e) {
           e.printStackTrace();
           return false;
       }
    }
    //Tentar coneecção e retornar drivermanager
    public static Connection getConnection() throws SQLException {
           // Configurar a URL de conexão, usuário e senha aqui
           Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
           return connection;
       }
    //Retornar ID do user
    public static int returnIDuser(String username, String password) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String sql = "SELECT * FROM allusers WHERE nome = ? AND senha = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int userType = resultSet.getInt("ID");
                connection.close();
                return userType;
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }
    public static int returnLastUser() {
    int lastUserId = 0;

    try {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

        String sql = "SELECT * FROM allusers ORDER BY ID DESC LIMIT 1";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            lastUserId = resultSet.getInt("ID");
        }

        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return lastUserId;
    }

}
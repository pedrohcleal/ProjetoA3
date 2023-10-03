import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/bd-bookhub";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";

    public static boolean checkLogin(String username, String password) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String sql = "SELECT * FROM users WHERE nome = ? AND senha = ?";
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
}
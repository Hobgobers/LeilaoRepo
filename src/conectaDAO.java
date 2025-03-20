import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {
    private static final String URL = "jdbc:mysql://localhost/mydb?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "Arkaosbb20032003";

    public Connection connectDB() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + erro.getMessage());
        }
        return conn;
    }
}





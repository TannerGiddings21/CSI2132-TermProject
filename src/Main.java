import java.sql.*;
public class Main {
    public static void main(String[] args) {
        String MASTER_PASSWORD_REQUIRED = "False";
        String url = "";
        String username = "";
        String password = "";
        try {
            Connection db = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            //DISPLAY ERROR OF SOME TYPE TO USER
        }
    }
}
import java.sql.*;

public class datab {
  public static void main(String[] args) {
    Connection connection;
try {
     ResultSet result = null;
     try {
          Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","cop2805");
    Statement statement = connection.createStatement();
    result = statement.executeQuery("SELECT * FROM Employees;");
    while(result.next()) {




      System.out.printf("%s %s \n", result.getString(2), result.getString(4), result.getString(3));




     
    }
} catch (SQLException e) {
    e.printStackTrace();
}
  }
}
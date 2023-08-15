import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Connection connection;
try {
     ResultSet result = null;
     ResultSet resultP = null;
     try {
          Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    connection = DriverManager.getConnection("jdbc:mysql://database-1.culbmfqkukyt.us-east-1.rds.amazonaws.com:3306/unodb","root","ITgroup3!");
    Statement statement = connection.createStatement();
    Statement statementP = connection.createStatement();
    result = statement.executeQuery("SELECT * FROM userbase;");
    resultP = statementP.executeQuery("SELECT * FROM prodinfo;");
    System.out.println("Pick an option: ");
    System.out.println("1. See user information");
    System.out.println("2. See product information");
    try (Scanner input = new Scanner(System.in)) {
      int choice = input.nextInt();
      switch (choice) {
       case 1:
       while(result.next()) {
         System.out.printf(" %s %s %s\n",result.getString(4), result.getString(2), result.getString(3));
        }
        break;

       case 2:
       while(resultP.next()) {
          System.out.printf("%s %d %s\n",resultP.getString(2), resultP.getInt(3), resultP.getString(4));
        }
        break;
      
       default:
         break;
      }
    }
} catch (SQLException e) {
    e.printStackTrace();
}
    }
}

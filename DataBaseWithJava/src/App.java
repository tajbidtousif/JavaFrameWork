import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/infocollector", "root", null);
            Statement stmt = con.createStatement();
            
            //stmt.executeQuery("SELECT * FROM info");
            stmt.executeUpdate("INSERT INTO info( VALUES ('Sadia Khatun'), ('Kudduch Ali') ); ");

            ResultSet rs = stmt.executeQuery("SELECT * FROM info");
            
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
            

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}


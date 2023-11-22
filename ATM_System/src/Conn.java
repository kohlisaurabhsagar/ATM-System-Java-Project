package src;
import java.sql.*;

public class Conn {
    Connection conn = null;
    Statement stmt = null;
    public Conn(){
        try{
           /*  Class.forName(com.mysql.cj.jdbc.Driver); */
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "root");
            stmt = conn.createStatement();
        }catch(Exception e){

        }
        
    }


    
}

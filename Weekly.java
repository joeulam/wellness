import java.util.*;
import java.sql.* ;

public class Weekly{
    public static double ave(){
        double a = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String add = "jdbc:mysql://192.168.1.120:80/app";
            Connection con = DriverManager.getConnection(add,Main.logins,Main.password);
            con.prepareStatement("SELECT FROM '"+Main.logins+"'");
        }
        catch(Exception e){
            System.err.println("Message: " + e.getMessage());
        }
        
        return a;
        
    }
}
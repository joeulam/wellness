import java.util.*;
import java.sql.* ;

public class Weekly{
    public static double ave(){
        double a = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String add = "jdbc:mysql://192.168.1.120:80/app";
            Connection con = DriverManager.getConnection(add,Main.logins,Main.password);
            for(int last = -7; last <= 0; last++){
                PreparedStatement cons = con.prepareStatement("SELECT 'dates','scale' FROM '"+Main.logins+"' WHERE DAY(dates) = MONTH(DATE_ADD(CURDATE(),INTERVAL"+ "DAY)");
                a += cons.executeUpdate();
            }
            a = a/7;
        }
        catch(Exception e){
            System.err.println("Message: " + e.getMessage());
        }
        
        return a;
        
    }
}
import java.util.*;
import java.sql.* ;

public class Weekly{
    public static double ave(){
        double a = 0;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String add = "jdbc:mysql://localhost:3306/app";
        Connection con = DriverManager.getConnection(add,Main.user);


        return a;
    }
}
import java.util.Scanner; 
import java.sql.* ;
import java.sql.Date;
import java.util.*;
import java.sql.Date.*;
public class Main {

    
    public static void main(String[] args) {
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);
        Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/app", "joeulam","jl308257");
    Statement myStat = myCon.createStatement();

        Scanner rating = new Scanner(System.in);
        System.out.println("On a scale of 1-10 how are you feeling today?");
        int userName = rating.nextInt();
        System.out.print(Scale.ratingcal(userName));
        
        myStat.executeUpdate("insert into app "+ " (Dates, Scale)"+ values (date, userName));
    }


}
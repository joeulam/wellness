import java.util.Scanner; 
import java.sql.* ;
import java.util.*;
import java.sql.Date.*;
public class Main {

    
    public static void main(String[] args) {
        long millis=System.currentTimeMillis();  
        java.sql.Date date =new java.sql.Date(millis);

        Scanner rating = new Scanner(System.in);
        System.out.println("On a scale of 1-10 how are you feeling today?");
        int userName = rating.nextInt();
        System.out.print(Scale.ratingcal(userName));



        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/app", "joeulam","jl308257");
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `app`(dates,scale) VALUES (?, ?)")){

                pstmt.setDate(1, date);
                pstmt.setInt(2,userName);
                pstmt.executeUpdate();
            System.out.println("Database connected");}
            catch (Exception e) {
                //TODO: handle exception
            }
        }
        
    }
        



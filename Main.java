import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.* ;

public class Main {

    
    public static void main(String[] args) {
        
        
       

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            long millis=System.currentTimeMillis();  
            java.sql.Date date =new java.sql.Date(millis);
            String add = "jdbc:mysql://localhost:3306/app";
            String user = "joeulam";
            String pass = "jl308257";
            Connection conn = DriverManager.getConnection(add,user,pass);
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `data`(dates,scale) VALUES (?, ?)");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner myObj = new Scanner(System.in);
            System.out.println("On a scale of 1-10 how are you feeling today?");
            int rating = myObj.nextInt(); 
            myObj.close(); 
            System.out.println(Scale.ratingcal(rating));
                pstmt.setDate(1, date);
                pstmt.setInt(2,rating);
                pstmt.executeUpdate();
                System.out.println(" Inserted");
                conn.close();
            }
            catch (Exception e) {
                System.err.println("Message: " + e.getMessage());
        }
            }
        }

    
        
    

        



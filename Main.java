import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.* ;

public class Main {

    
    public static void main(String[] args) {
        
        
       

        try{
            // DRIVER/CONNECTOR SET UP
            Class.forName("com.mysql.cj.jdbc.Driver");
            long millis=System.currentTimeMillis();  
            java.sql.Date date =new java.sql.Date(millis);
            String add = "jdbc:mysql://localhost:3306/app";
            String user = "joeulam";
            String pass = "jl308257";

            //AUTHORIZATION & WHAT DATA TO INSORT
            Connection conn = DriverManager.getConnection(add,user,pass);
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `data`(dates,scale) VALUES (?, ?)");

            Scanner myObj = new Scanner(System.in); //Open scanner class
            System.out.println("On a scale of 1-10 how are you feeling today?");
            int rating = myObj.nextInt(); //Read user response
            myObj.close(); //close scanner

            System.out.println(Scale.ratingcal(rating)); //return reponse
                pstmt.setDate(1, date);//inserts date
                pstmt.setInt(2,rating);//inserts reponse
                pstmt.executeUpdate();//sends it to the database
                System.out.println(" Inserted");
                conn.close();//close database
            }
            catch (Exception e) {
                System.err.println("Message: " + e.getMessage());
        }
            }
        }

    
        
    

        



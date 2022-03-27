
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.* ;
import java.io.Reader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {

    
    public static void main(String[] args) {
        try{
            // DRIVER/CONNECTOR SET UP
            Class.forName("com.mysql.cj.jdbc.Driver");
            long millis=System.currentTimeMillis();  
            java.sql.Date date =new java.sql.Date(millis);
            String add = "jdbc:mysql://localhost:3306/app";
            Scanner username = new Scanner(System.in);
            System.out.println("Type your username");
            String logins = username.nextLine(); //Read user response
            System.out.println("Enter your password");
            String password = username.nextLine();
            username.close();
            Connection con = DriverManager.getConnection(add,"checker","guest");
            Connection usercr = DriverManager.getConnection(add,"checker","guest");
            String que = "CREATE USER IF NOT EXISTS " +logins+"@'localhost' IDENTIFIED BY '"+password+"'";
            PreparedStatement usercs = usercr.prepareStatement(que);
            PreparedStatement ps = con.prepareStatement("CREATE TABLE IF NOT EXISTS "+logins+"() ADD COLUMN `dates` DATETIME NOT NULL FIRST,ADD PRIMARY KEY (`dates`) ADD COLUMN `scale` INT NOT NULL AFTER `dates`, ADD COLUMN `reponse` VARCHAR(225) NULL AFTER `scale`,ADD PRIMARY KEY (`dates`, `scale`);");
            usercs.executeUpdate();
            ps.executeQuery();

            /*if(!(ps.executeQuery().equals(logins)))
           {
            Connection cons = DriverManager.getConnection(add,"checker","guest");
            PreparedStatement tablemaker = cons.prepareStatement("CREATE TABLE `app`."+logins+"() ADD COLUMN `dates` DATETIME NOT NULL FIRST,ADD PRIMARY KEY (`dates`) ADD COLUMN `scale` INT NOT NULL AFTER `dates`, ADD COLUMN `reponse` VARCHAR(225) NULL AFTER `scale`,ADD PRIMARY KEY (`dates`, `scale`);");
            tablemaker.executeQuery ();
           }*/
            
            String user = logins;
            String pass = password;

            //AUTHORIZATION & WHAT DATA TO INSORT
            Connection conn = DriverManager.getConnection(add,user,pass);


            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO `data`(dates,scale,reponse) VALUES (?, ?, ?)");




            Scanner myObj = new Scanner(System.in); //Open scanner class
            System.out.println("On a scale of 1-10 how are you feeling today?");
            int rating = myObj.nextInt(); //Read user response
            System.out.println(Scale.ratingcal(rating)+"what happened?");
            String respone = myObj.nextLine();
            respone = myObj.nextLine();

            myObj.close(); //close scanner

                pstmt.setDate(1, date);//inserts date
                pstmt.setInt(2,rating);//inserts rating
                pstmt.setString(3, respone);
                pstmt.executeUpdate();//sends it to the database
                conn.close();//close database
            }
            catch (Exception e) {
                System.err.println("Message: " + e.getMessage());
        }
            }
        }

    
        
    

        



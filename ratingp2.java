import java.io.File.*;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;  
import java.time.*;
public class ratingp2 {
    static String toberated;
    static int backend;
    public static int backcount(String a,int b)
    {
        BufferedWriter bw = null;

        try{
            if(b >= 8)
            {
                FileWriter fw=new FileWriter("C:/Users/joeul/Documents/GitHub/wellness/posword.txt",true); 
                bw = new BufferedWriter(fw); 
                bw.write(a+"\r\n");
                bw.close();    

            }
            else if (b>=4 && b<=7)
            {
                FileWriter fw=new FileWriter("C:/Users/joeul/Documents/GitHub/wellness/neur.txt",true);    
                bw = new BufferedWriter(fw);   
                bw.write(a+"\r\n");
                bw.close();    

            }
            else{
                FileWriter fw=new FileWriter("C:/Users/joeul/Documents/GitHub/wellness/negwords.txt",true);
                bw = new BufferedWriter(fw);     
                bw.write(a+"\r\n");
                bw.close();    

            }
            
        }
        catch(FileNotFoundException e) {
            System.out.println("An error occurred...");
            e.printStackTrace();

    }
    catch(Exception e){System.out.println(e);}    
          System.out.println("Success writing...");

    
    return backend;
    }


    public static int pday()
    {
        LocalDate mill = LocalDate.now();
    if(getDayNumberNew(mill)== 5) //change to 5
    {
        return 1;
    }
     return 0;
    }
    public static int getDayNumberNew(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day.getValue();
    }
}


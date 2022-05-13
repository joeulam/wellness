import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;
import java.io.FileWriter;  
import java.time.*;
public class ratingp2 {
    static String toberated;
    static int backend;
    public static int backcount(String a,int b)
    {
        try{
            if(b >= 8)
            {
                FileWriter fw=new FileWriter("C:/Users/joeul/Documents/GitHub/wellness/posword.txt");    
                fw.write(a+"\r\n");
                fw.close();    

            }
            else if (b>=4 && b<=7)
            {
                FileWriter fw=new FileWriter("C:/Users/joeul/Documents/GitHub/wellness/neur.txt");    
                fw.write(a+"\r\n");
                fw.close();    

            }
            else{
                FileWriter fw=new FileWriter("C:/Users/joeul/Documents/GitHub/wellness/negwords.txt");    
                fw.write(a+"\r\n");
                fw.close();    

            }
            
        }
        catch(FileNotFoundException e) {
            System.out.println("An error occurred...");
            e.printStackTrace();

    }
    catch(Exception e){System.out.println(e);}    
          System.out.println("Success writing...");

    LocalDate mill = LocalDate.now();
    if(getDayNumberNew(mill)== 5) //change to 5
    {
        System.out.println(pday());
    }
    return backend;
    }

    public static int pday()
    {
        return 1;//get a sql call of last 7 days
    }
    public static int getDayNumberNew(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day.getValue();
    }
}


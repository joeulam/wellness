import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;
import java.time.*;
public class ratingp {
    static String toberated;
    static int backend;
    public static int backcount(String a,int b)
    {
        
        toberated = a;
        backend = b-1;
        try{
            File myobj2 = new File("negative-words.txt");
            Scanner myreader2 = new Scanner(myobj2);//reads negitive txt file
            File myObj = new File("positive-words.txt");
            Scanner myReader = new Scanner(myObj);//reads positive txt file
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String neg = myreader2.nextLine();
                if(toberated.contains(data) && backend < 10)
                {
                    backend++;
                }
                if(toberated.contains(neg) && backend > 0)
                {
                    backend--;
                }
            }
            myReader.close();
            myreader2.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            //Tries to look for keywords and grade the response
    }
    LocalDate mill = LocalDate.now();
    if(getDayNumberNew(mill)== 3) //change to 5
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


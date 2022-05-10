import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

import javax.xml.crypto.Data;

public class ratingp {
    static String toberated;
    static int backend = 0;

    public static int backcount(String a)
    {
        toberated = a;
        try{
            File myobj2 = new File("negitive-words.txt");
            Scanner myreader2 = new Scanner(myobj2);//reads negitive txt file
            File myObj = new File("positive-words.txt");
            Scanner myReader = new Scanner(myObj);//reads positive txt file
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String neg = myreader2.nextLine();
                if(toberated.contains(data))
                {
                    backend++;
                }
                if(toberated.contains(neg))
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

    }
    return backend;
    }
}


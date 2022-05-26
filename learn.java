import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;
import java.io.FileWriter;  
import java.time.*;

public class learn{
            public static void learn(){
                
                try {
                    File myobj2 = new File("positive-words.txt");
                    Scanner myreader2 = new Scanner(myobj2);//reads positive key words txt file
                    File myObj = new File("posword.txt");
                    Scanner myReader = new Scanner(myObj);//reads positive txt file
                while(myReader.hasNext()){
                    String data2 = myReader.nextLine();
                    String data = myreader2.nextLine();
                if(data2.contains(data)){

                }
                }
            } 
                
                catch (Exception e) {
                    //TODO: handle exception
                }
                
                
                
            }
                
            
    }



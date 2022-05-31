import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;
import java.io.FileWriter;  
import java.time.*;

public class learn{
            public static void learn(){
                

            }
            public void learns(){
                BufferedWriter bw = null;
                try {
                    File myobj2 = new File("positive-words.txt");
                    Scanner myreader2 = new Scanner(myobj2);//reads positive key words txt file
                    File myObj = new File("posword.txt");
                    Scanner myReader = new Scanner(myObj);//reads positive txt file
                    int i = 0;
                    int counter = 0; 
                while(myReader.hasNext()){
                    String data2 = myReader.nextLine();//reads next line
                    int canidate = data2.indexOf(" ");//find first instance of space
                    String canidate2 = data2.substring(i, canidate);//substrings the line to the space
                    i = canidate;//set new min to the old space
                    System.out.println(canidate2);
                if(data2.contains(canidate2) ){
                    counter++;
                }
                data2 = data2.substring(canidate);// shortens the string
                if(counter >= 5){
                    //code to write into txt
                    FileWriter fw = new FileWriter("positive-words.txt",true);
                    bw = new BufferedWriter(fw);
                    fw.write(canidate2);
                    System.out.println(counter);
                    fw.close();
                }
                }
            } 
                
                catch (Exception e) {
                    //TODO: handle exception
                }
                
                
                
            }
                
            
    }



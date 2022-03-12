import java.util.Scanner; 
import java.sql.* ;

public class Main {

    
    public static void main(String[] args) {
        Scanner rating = new Scanner(System.in);
        System.out.println("On a scale of 1-10 how are you feeling today?");
        int userName = rating.nextInt();
        System.out.print(Scale.ratingcal(userName));
    }

}
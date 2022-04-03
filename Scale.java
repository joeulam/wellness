
public class Scale {


    public static String ratingcal(int range)
    {
        if(range <= 0 || range >= 11)
        {
            return "Not a number in range";
        }
        else{
            if(range <= 3)
            {
                return "Oh no what happened?";
            }
            else if (range >= 4 && range <= 7)
            {
                return "Oh why was it eh?";
            }
            else{
                return "WOOO yay";
            }
        }
    }
    



    
}


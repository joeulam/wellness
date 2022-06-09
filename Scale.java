
public class Scale {

//Base responses
    public static String ratingcal(int range)
    {
        if(range <= 0 || range >= 11)
        {
            return "Not a number in range";
        }
        else{
            if(range <= 3)
            {
                return "Oh no ";
            }
            else if (range >= 4 && range <= 7)
            {
                return "Oh why ";
            }
            else{
                return "WOOO ";
            }
        }
    }
    



    
}


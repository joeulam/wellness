
public class Scale {
    

    public static String ratingcal(int range)
    {
        if(range <= 3)
        {
            return "Oh no what happened?";
        }
        else if (range >= 4 && range <= 7)
        {
            return "Oh why was it medicore?";
        }
        else{
            return "WOOO did something special happen?";
        }
    }
}

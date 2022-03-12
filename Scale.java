
public class Scale {
    
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "joeulam";
    static final String PASS = "jl308257";
    static final String QUERY = "SELECT id, first, last, age FROM Employees";
 
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
        INSERT Database ()
    }
}

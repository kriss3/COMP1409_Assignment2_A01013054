
/**
 * PurchaseDate class to model purchase date
 * 
 * @author Krzysztof Szczurowski 
 * @version 1.1
 * @since 11/16/2016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2111241/View
 */
public class PurchaseDate
{
    private int year;
    private int month;
    private int day;
    
    public static final int CURRENT_YEAR = 2016;
    
    public static final int JANUARY =  1;
    public static final int DECEMBER = 12;
        
    public static final int FIRST_DAY = 1;
    public static final int LAST_DAY = 31;
    
    /**
     * Constructor for PurchaseDate class; <br>
     * It uses setter method to validate input parameters; <br>
     * 
     * @param theYear as integer;
     * @param theMonth as integer;
     * @param theDay as integer;
     */
    public PurchaseDate(int theYear, int theMonth, int theDay)
    {
        setDay(theDay);
        setMonth(theMonth);
        setYear(theYear);
    }
    
    /**
     * Public method to get value of day variable; <br>
     * It takes no parameters; <br>
     * @return returns instance variable day as integer;
     */
    public int getDay()
    {
        return this.day;
    }
    
    /**
     * Public method to set value of day variable; <br>
     * It does not return any value; <br>
     * @param takes value to set as integer;
     */
    public void setDay(int value)
    {
       this.day = (value < FIRST_DAY || value > LAST_DAY ? FIRST_DAY : value);
    }
    
    /**
     * Public method to get value of month variable; <br>
     * It takes no parameters; <br>
     * @return returns instance variable month as integer;
     */
    public int getMonth()
    {
        return this.month;
    }
    
    /**
     * Public method to set value of month variable; <br>
     * It does not return any value; <br>
     * @param takes value to set as integer;
     */
    public void setMonth(int value)
    {
        this.month = (value < JANUARY || value > DECEMBER ? JANUARY : value);
    }
    
    /**
     * Public method to get value of year variable; <br>
     * It takes no parameters; <br>
     * @return returns instance variable year as integer;
     */
    public int getYear()
    {
        return this.year;
    }
    
    /**
     * Public method to set year value, it does not return any value;
     * @param takes value parameter as integer;
     */
    public void setYear(int value)
    {
        this.year = (value > CURRENT_YEAR ? CURRENT_YEAR : value);
    }
    
    /**
     * Public method getDate(), takes no parameters and returns date in a specified format
     * @return returns full date in a format of yyyy-mm-dd 
     */
    public String getDate()
    {
        return String.format("%1$04d-%2$02d-%3$02d", year, month, day);
    }
    
}

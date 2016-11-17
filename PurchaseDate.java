
/**
 * Write a description of class PurchaseDate here.
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
    
    
   
    public static final String[] months =  
        {"Januray","February","March","April","May","June","July","August","September","October","November","December"};
        
    public static final int FIRST_DAY = 1;
    public static final int LAST_DAY = 31;
    
    public PurchaseDate(int theYear, int theMonth, int theDay)
    {
        if(theYear <= CURRENT_YEAR)
        {
            this.year = theYear;
            if(isValidMonth(theMonth))
            {
                this.month = theMonth;
            }
            
            if(isValidDay(theDay))
            {
                this.day = theDay;
            }
        }
        
        
    }
    
    private boolean isValidMonth(int monthValue)
    {
        boolean result = false;
        if(monthValue >= 1 && monthValue <= 12)
        {
            result = true;
        }
        return result;
    }
    
    private boolean isValidDay(int day)
    {
        boolean result = true;
        if(day < FIRST_DAY || day > LAST_DAY)
        {
            result = false;
        }
        return result;
    }
    
}


/**
 * Write a description of class Customer here.
 * 
 * @author Krzysztof Szczuorowski 
 * @version 1.1
 * @since 11/16/2016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2111241/View
 */
public class Customer
{
    private String firstName;
    private String lastName;
    private String drivingLicense;
    private String address;
    private String phoneNumber;
    
    public Customer()
    {
        this.firstName = "Joe";
        this.lastName = "Blogs";
        this.drivingLicense = "000001";
        this.address = "61 Java Street";
        this.phoneNumber = "555-55-055";
    }
    
    public Customer(String firstName, String lastName, String drivingLicense, 
                    String address, String phoneNumber)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setDrivingLicense(drivingLicense);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }
    
    //Properties
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public void setFirstName(String value)
    {   
        if(value != null && value.length() > 0)
        {
           this.firstName = value.substring(0,1).toUpperCase() + value.substring(1).toLowerCase(); 
        }
        
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public void setLastName(String value)
    {
        if(value != null && value.length() > 0)
        {
           this.lastName = value.substring(0,1).toUpperCase() + value.substring(1).toLowerCase(); 
        }
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setAddress(String value)
    {
        if(value != null && value.length() > 0)
        {
           this.address = value;
        }
    }
    
    public String getDrivingLicense()
    {
        return this.drivingLicense;
    }
    
    public void setDrivingLicense(String value)
    {
        if(value != null && value.length() > 0)
        {
           this.drivingLicense = value;
        }
    }
    
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String value)
    {
        if(value != null && value.length() > 0)
        {
            this.phoneNumber = value;
        }
    }
    
    //Public methods
    public String fullNameTag()
    {
        return firstName + " " + lastName;
    }
}

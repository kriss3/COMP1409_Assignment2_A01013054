
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
        this.address = "61 Java Street";
        this.phoneNumber = "555-55-055";
    }
    
    public Customer(String firstName, String lastName, String drivingLicense, String address, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.drivingLicense = drivingLicense;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    //Properties
    public String getFirstName()
    {
        return this.firstName;
    }
}

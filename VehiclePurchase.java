
/**
 * VehiclePurchse class to model puchasing of a vehicle;
 * 
 * @author Krzysztof Szczurowski
 * @version 1.1
 * @since 11/16/2016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2111241/View
 */
public class VehiclePurchase
{
    private Customer customer;
    private PurchaseDate purchaseDate;
    private Vehicle vehiclePurchased;
    private boolean servicePackage;
    private static final double SERVICE_FEE = 500.00;
    
    /**
     * Public constructor method for PurchaseVehicle class;
     * @param retner as Customer;
     * @param purchaseDate as PurchaseDate;
     * @param vehiclePurchased as Vehicle;
     * @param servicePackage as boolean;
     */
    public VehiclePurchase(Customer renter, PurchaseDate purchaseDate, Vehicle vehiclePurchased, boolean servicePackage)
    {
        this.customer = renter;
        this.purchaseDate = purchaseDate;
        this.vehiclePurchased = vehiclePurchased;
        this.servicePackage = servicePackage;
    }
    
    //properties
    /**
     * Public getter method to return a reference to a Customer object;
     * @return returns a reference to customer object;
     */
    public Customer getCustomer()
    {
        return this.customer;
    }
    
    /**
     * Public getter method to return a reference to purchaseDate object;
     * @return returns a reference to PurchaseDate object;
     */
    public PurchaseDate getPurchaseDate()
    {
        return this.purchaseDate;
    }
    
    /**
     * Public getter method to return a reference to a Vehicle object;
     * @return returns a reference to vehicle object;
     */
    public Vehicle getVehiclePurchased()
    {
        return this.vehiclePurchased;
    }
    
    /**
     * Public getter method to get the value of service package;
     * @return returns value of service package as Boolean;
     */
    public boolean getServicePackate()
    {
        return this.servicePackage;
    }
    
    /**
     * Public setter method to set the value of a service package;
     * @param takes value parameter of Service Package as Boolean;
     */
    public void setServicePackage(boolean value)
    {
        //asl Gary if we r interesting in recalculating profitMargin ans sellingPrive 
        //after changing state of Service_Fee?
        this.servicePackage = value;
    }   
    
    /**
     * Public method to calculate and set the value of vehicle's purchase price;<br>
     * It does not return any value;<br>
     * @param takes purchasePrice parameter as double; 
     */
    public void calculatePurchasePrice(double purchasePrice)
    {
        if(!this.servicePackage)
        {
            vehiclePurchased.checkStandardSellingPrice(purchasePrice);
        }
        else
        {
            vehiclePurchased.checkStandardSellingPrice(purchasePrice  + SERVICE_FEE);
        }
    }
    
    /**
     * Public method to print out combined details of customer/vehicle/purchase date;<br>
     * It does not return any value and it does not take any parameter;
     */
    public void displayDetails()
    {
       System.out.println("Customer: " + customer.fullNameTag());
       System.out.println("Purchase Date: " + purchaseDate.getDate());
       System.out.print("Vehicle Description:");
       vehiclePurchased.printDetails();
       if(servicePackage)
       {
           System.out.println("SERVICE PACKAGE INCLUDED");
       }
       else
       {
           System.out.println("SERVICE PACKAGE NOT INCLUDED");
       }
    }
}

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
    public VehiclePurchase(Customer renter, PurchaseDate purchaseDate, Vehicle vehiclePurchased,boolean servicePackage)
    {
        this.customer = renter;
        this.purchaseDate = purchaseDate;
        this.vehiclePurchased = vehiclePurchased;
        this.servicePackage = servicePackage;
    }
    
    //properties
    public Customer getCustomer()
    {
        return this.customer;
    }
    
    public PurchaseDate getPurchaseDate()
    {
        return this.purchaseDate;
    }
    
    public Vehicle getVehiclePurchased()
    {
        return this.vehiclePurchased;
    }
    
    public boolean getServicePackate()
    {
        return this.servicePackage;
    }
    
    public void setServicePackage(boolean value)
    {
        this.servicePackage = value;
    }   
    
    public void calculatePurchasePrice(double purchasePrice)
    {
        double purchasePriceWithServieFee;
        vehiclePurchased.checkStandardSellingPrice(purchasePrice);
        if(this.servicePackage)
        {
            purchasePriceWithServieFee = purchasePrice + SERVICE_FEE;
            vehiclePurchased.checkStandardSellingPrice(purchasePriceWithServieFee);
        }
    }
    
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
    }
}

/**
 * Company
 * Every instance represents one company with a name. If finalized, it will send a mesage to {@link Ticker#print(String)}.
 * 
 * @author Nico Ziehe
 */
public class Company {
    
    /**
     * The name of the company.
     */
    private String name;

    /**
     * Instantiates a new Company with a companyName.
     * @param companyName the name of this Company
     */
    public Company(String companyName){
        this.name = companyName;
    }

    /**
     * Gets the name of this company.
     * @return The name of this company
     */
    public String getName(){
        return this.name;
    }

    /**
     * Sends a message with the new stock proce of this company to the Ticker.
     * @param stockPrice The new stock price of this company
     */
    public void changeStockPrice(double stockPrice){
        Ticker.getInstance().print(this.name + " " + stockPrice);
    }

    /**
     * Destructor, sending the message that the company is insolvent to the Ticker.
     */
    protected void finalize(){
        Ticker.getInstance().print(name + " is insolvent");
    }
}

/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
//Question 1: How can we tell from just its header that setPrice is a method and not a constructor?
//public void setPrice(int cost)?
// Because setPrice is not an object
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // The score for the machine
    private int score;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine()
    {
        price = 1000; //price of ticket is now 1,000 cents.
        balance = 0;
        total = 0;
    }
    
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }
    
    /**
     * Set price that assigns value of its parameter.
     */
    public void setPrice(int costTicket)
    {
        price = costTicket;
    }
    
    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }
    
 /**
 * Reduce price by the given amount.
 */
public void discount(int amount)
{
  price = price - amount;
}

public void prompt()
{
 System.out.println("# Please insert the correct amount of money.");
    
}
    
 public void showPrice()
    {
        System.out.println("The price of the ticket is"+price+"cents");
    }
   
   public void empty() //Removing all money from the machine. This method doesn't need any parameters. 
   {
       total = 0;
    }
    
    // creating two ticket machine of type x and y.
    TicketMachine x = new TicketMachine(30);
    TicketMachine y = new TicketMachine(20);
    
    x.showPrice();
    y.showPrice();
    
    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
}
